package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    // Constructor
    public User() {
    	
    }
    
    public User(Integer id, int pin){
    	this.id = id;
    	this.pin = pin;
    }
    
    // Getter and Setter
    public Integer getId() {
    	return this.id;
    }
    public void setId() {
    	System.out.println("ID: " + this.id);
    }
    
    public int setPin() {
    	return this.pin;
    }
    public void getPin() {
    	System.out.print("PIN: " + this.pin);
    }
}

// TO DO: Getters and Setters
// Implement a constructor that takes an ID
