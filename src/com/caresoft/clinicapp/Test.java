package com.caresoft.clinicapp;

public class Test {
	public static void main(String[] args) {
		Physician doctor1 = new Physician(1345, 5000);
		Physician doctor2 = new Physician(1234, 5000);
		AdminUser user1 = new AdminUser(1320, "Companion");
		AdminUser user2 = new AdminUser(1738, "Companion");
		
		System.out.println("=====Physician Pin Tests=====");
		System.out.println("Physician Test 1: " + (doctor1.assignPin(42)? "PASS" : "FAIL"));
		System.out.println("Physician Test 2: " + (doctor1.assignPin(4000)? "PASS" : "FAIL"));
		System.out.println("Physician Test 3: " + (doctor1.assignPin(1111)? "PASS" : "FAIL"));
		System.out.println("Physician Test 4: " + (doctor1.assignPin(678)? "PASS" : "FAIL"));
		System.out.println("=====Physician Auth Tests=====");
		System.out.println("Physician Test 5: " + (doctor1.accessAuthorized(4000)? "PASS" : "FAIL"));
		System.out.println("Physician Test 6: " + (doctor1.accessAuthorized(1345)? "PASS" : "FAIL"));
		System.out.println("Physician Test 7: " + (doctor2.accessAuthorized(1234)? "PASS" : "FAIL"));
		
		System.out.println("=====Admin Pin Tests=====");
		System.out.println("Admin Test 1: " + (user1.assignPin(123)? "PASS" : "FAIL"));
		System.out.println("Admin Test 2: " + (user1.assignPin(123123)? "PASS" : "FAIL"));
		System.out.println("=====Admin Auth Tests=====");
		System.out.println("Admin Test 3: " + (user1.accessAuthorized(1320)? "PASS" : "FAIL"));
		System.out.println("Admin Test 4: " + (user1.accessAuthorized(1321)? "PASS" : "FAIL"));
		System.out.println("Admin Test 5: " + (user2.accessAuthorized(1738)? "PASS" : "FAIL"));
		System.out.println("Admin Test 6: " + (user2.accessAuthorized(1739)? "PASS" : "FAIL"));
		System.out.println("Admin Test 6: " + (user2.accessAuthorized(17395)? "PASS" : "FAIL"));
		
		
		System.out.println("=====Admin Security Tests=====");
		System.out.println(user1.reportSecurityIncidents());
		System.out.println(user2.reportSecurityIncidents());
	}
}

