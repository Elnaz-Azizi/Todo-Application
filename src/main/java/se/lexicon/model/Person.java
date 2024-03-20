package se.lexicon.model;

public class Person {

    // Fields
    private int id1;
    private String firstName1;
    private String lastName1;
    private String email1;


    // Constructors

    // Setters  Getters

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getSummary() {
        return "Person Information-> id: " + id1 + "First name: " + firstName1 + "Last name: " + lastName1 + "Email address: " + email1 + "\n";
    }

    // Methods

}
