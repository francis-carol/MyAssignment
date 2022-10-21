package org.student;

import org.department.Department;

public class Student extends Department{
public static void studentName() {
	
	System.out.println("Carol");
		
	}
public static void studentDept() {
	System.out.println("ECE");
	
}
public static void studentId() {
	System.out.println("123");
	
}

public static void main(String[] args) {
	Student student = new Student();
	System.out.println("The StudentDetails :");
	System.out.println("===========================");
	student.studentName();
	student.studentId();
	student.studentDept();
	System.out.println("                        ");
	System.out.println("The Department Details:");
	System.out.println("=======================");
	student.deptName();
	System.out.println("                          ");
	System.out.println("The College Details:");
	System.out.println("====================");
	student.collegeName();
	student.collegeCode();
	student.collegeRank();

	
}

}
