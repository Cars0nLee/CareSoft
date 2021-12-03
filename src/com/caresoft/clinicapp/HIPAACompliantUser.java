package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
	// Methods
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}

