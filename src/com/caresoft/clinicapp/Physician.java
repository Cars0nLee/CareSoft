package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	// Member variables (attributes)
	private ArrayList<String> patientNotes;
	
	// Constructor
	public Physician() {
		
	}
	
	public Physician(Integer id, int pin) {
		this.id = id;
		this.pin = pin;
	}
	
	// Methods
	public void newPatientNotes(String notes, String patientName, Date date) {
    String report = String.format(
        "Datetime Submitted: %s \n", date);
    report += String.format("Reported By ID: %s\n", this.id);
    report += String.format("Patient Name: %s\n", patientName);
    report += String.format("Notes: %s \n", notes);
    this.patientNotes.add(report);
	}
	
    // Getters and Setters
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

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length(); // converts integer to a string and gets length of the string
		if (length < 4) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (confirmedAuthID.equals(this.id)) {
			return true;
		}
		else {
			return false;
		}
	}
}



