package org.whole.crossexamples.lwc11.examples.beans;


public class Person {
    private String name;
    private String firstName;
    private java.util.Date birthDate;
    private Car ownedCar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public java.util.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Car getOwnedCar() {
        return ownedCar;
    }

    public void setOwnedCar(Car ownedCar) {
        this.ownedCar = ownedCar;
    }
}
