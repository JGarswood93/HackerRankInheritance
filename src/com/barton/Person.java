package com.barton;

public class Person {
    /**
     * What needs to be done
     * <p>
     * Within these two classes (Person base Student derived) we need 4 parameters
     * prenom, nom, id and interger array of scores
     * <p>
     * char calculator method for the averages
     * <p>
     * The locked stub code in your editor
     * calls your Student class constructor and passes it the necessary arguments.
     * It also calls the calculate method (which takes no arguments).
     *
     * This is for giving some input arguments/ parameters
     */

    protected String firstName;//protected is accessible within all classes in the same package
    protected String lastName;
    protected int idNumber;

    public Person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;//this keyword refers to the object were the method or constructor is being invoked
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName
                + "\nID:" + idNumber);
    }
}
