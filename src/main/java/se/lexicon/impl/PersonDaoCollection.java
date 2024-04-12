package se.lexicon.impl;

import se.lexicon.model.AppUser;
import se.lexicon.model.Person;
import se.lexicon.sequencers.PersonIdSequencer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class PersonDaoCollection implements PersonDao{

    private Collection<Person> personRepository;

    public PersonDaoCollection() {

        this.personRepository = new ArrayList<>();
    }

    @Override
    public Person persist(Person person) {
       int id = PersonIdSequencer.nextId();
       person.setId(id);


        return null;
    }

    @Override
    public Optional<Person> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Collection<Person> findAll() {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
