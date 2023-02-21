package org.system;

public class Department extends College {
	public void deptName() {
		System.out.println("BCA");

	}
	public static void main(String[] args) {
		Department a = new Department();
		a.collegeName();
		a.collegeCode();
		a.deptName();
		a.collegeRank();
	}

}
