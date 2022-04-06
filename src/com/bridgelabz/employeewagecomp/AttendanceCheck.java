package com.bridgelabz.employeewagecomp;

/**
 * Check Employee Attendance.
 * 
 * @author Snehal
 */
public class AttendanceCheck {
	public static void main(String[] args) {
		// Print Program name
		System.out.println("Welcome to Employee Wage Computation");

		// Constant variable
		int Full_Time = 1;

		/*
		 * Using Random function getting input either 0 or 1. check attendance
		 * accordingly .1 = Present and 0 = absent
		 */
		int Emp_Check = (int) (Math.floor(Math.random() * 10) % 2);
		System.out.println("Random value for Employee Attendence check is: " + Emp_Check);

		if (Emp_Check == Full_Time) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}