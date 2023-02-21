package org.system;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID : " + id);
	}
	public void getStudentInfo(int id , String name){
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}
	public void getStudentInfo(String email, String phonenumber) {
	System.out.println("Student Email : " + email);	
	System.out.println("Student PhoneNumber : " + phonenumber);
	}
	public static void main(String[] args) {
		Students a = new Students();
		a.getStudentInfo(23);
		a.getStudentInfo(23, "Pavithra");
		a.getStudentInfo("pavithra23", "25689741");
	}
}

