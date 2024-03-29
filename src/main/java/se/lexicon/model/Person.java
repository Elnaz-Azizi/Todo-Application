package se.lexicon.model;

import java.util.Objects;

public class Person {

    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person(int id, String firstName, String lastName, String email, AppUser credentials) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredentials(credentials);
    }


    public Person(int id, String firstName, String lastName, String email) {
        this(id, firstName, lastName);
        setEmail(email);
    }

    public Person(int id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
// Setters  Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("first name should not be null.");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
    // Methods

}
