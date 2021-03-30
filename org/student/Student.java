package org.student;

import ogr.departmrnt.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Aravind RK");
	}
	public void studentDepartment() {
		System.out.println("Computer Science And Engineering");
	}
	public void studentId() {
		System.out.println("621213104008");
		
	}
public static void main(String[] args) {
	Student std =new Student();
	std.collegeName();
	std.collegeCode();
	std.collegeRank();
	std.department();
	std.studentName();
	std.studentId();
	std.studentDepartment();
}
}
