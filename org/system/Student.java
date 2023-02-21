package org.system;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name is Pavithra");
	}
	public void studentDept() {
		System.out.println("Department is BCA");
	}
	public void studentId() {
		System.out.println("25987");

	}
	public static void main(String[] args) {
		Student a = new Student();
		a.collegeName();
		a.collegeCode();
		a.deptName();
		a.collegeRank();
		a.studentDept();
		a.studentId();
		a.studentName();
		
	}
	

}
