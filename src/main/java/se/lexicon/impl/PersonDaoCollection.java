package se.lexicon.impl;

import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.sequencers.PersonIdSequencer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class PersonDaoCollection implements PersonDao {

    private Collection<Person> personRepository;

    public PersonDaoCollection() {

        this.personRepository = new ArrayList<>();
    }

    @Override
    public Person persist(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person can not  be null.");
        }
        int id = PersonIdSequencer.nextId();
        person.setId(id);
        personRepository.add(person);
        return person;
    }

    @Override
    public Optional<Person> findById(int id) {
        for (Person person : personRepository) {
            if (person.getId() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        for (Person person : personRepository) {
            if (person.getEmail().equals(email)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    @Override
    public Collection<Person> findAll() {
        return new ArrayList<>(personRepository);
    }

    @Override
    public void remove(int id) {
        Optional<Person> foundPerson = findById(id);
        if (!foundPerson.isPresent()) {
            throw new IllegalArgumentException("Person not found");
        }
        personRepository.remove(foundPerson.get());
    }
}
