/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.business;

import java.time.LocalDate;

/**
 *
 * @author JSIIT
 */
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private double gpa;
    private LocalDate dob;
    
    public Student(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    
    @Override
    public String toString(){
        return "Student ID:            " + this.getId() + "\n" +
               "Student first name:    " + this.getFirstName() + "\n" +
               "Student last name:     " + this.getLastName() + "\n" +
               "Student gender:        " + this.getGender() + "\n" +
               "Student G.P.A:         " + this.getGpa() + "\n" +
               "Student date of birth: " + this.getDob();
    }
    
}
