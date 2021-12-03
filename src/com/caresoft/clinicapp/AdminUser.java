package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<String>();
	
	// Constructor
	public AdminUser(Integer employeeID, String role) {
		this.employeeID = employeeID;
		this.role = role;
	}
	
	// Getters and Setters
	public Integer getEmployeeID() {
		return this.employeeID;
	}
	public String getRole() {
		return this.role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return this.securityIncidents;
	}
	
	public void setEmployeeID() {
		System.out.println("Employee ID: " + this.employeeID);
	}
	
	// Methods
//	public void newIncident(String notes) {
//	    String report = String.format(
//	        "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
//	        new Date(), this.id, notes
//	    );
//	    securityIncidents.add(report);
//	}
	public void authIncident() {
	    String report = String.format(
	        "Datetime Submitted: %s \n  ID: %s\n Notes: %s \n", 
	        new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
	    );
	    System.out.println(report);
	    securityIncidents.add(report);
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if(length < 6) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID.equals(this.employeeID)) {
			return true;
		}
		else {
			authIncident();
			return false;
		}
	}
}

