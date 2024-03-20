package se.lexicon.model;

public class Person {

    // Fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;


    // Constructors

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

    public String getSummary() {
        return "Person Information-> id: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Email address: " + email + "\n";
    }

    // Methods

}
