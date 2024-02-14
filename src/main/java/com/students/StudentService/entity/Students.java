package com.students.StudentService.entity;

public class Students {

    private String firstName;
    private String lastName;

    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Students() {
    }  

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
