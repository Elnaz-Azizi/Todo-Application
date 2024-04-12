package se.lexicon.impl;

import se.lexicon.model.Person;

import java.util.Collection;
import java.util.Optional;

public interface PersonDao {
    Person persist (Person person);
   Optional <Person> findById (int id);
    Optional <Person> findByEmail (String email);
    Collection<Person> findAll();
    void remove (int id);

}
