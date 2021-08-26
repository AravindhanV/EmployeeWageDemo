package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static final int FULL_TIME_HRS = 8;
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int ABSENT = 0;
	
	public static void main(String[] args) {
		calculateWage(20,100,20);
	}
	
	public static void calculateWage(int noOfDays, int maxHrs, int wagePerHour) {
		int totalHrs = 0,day=0;		
		while(totalHrs < maxHrs && day < noOfDays) {
			int hours=0;
			double empCheck = Math.floor(Math.random()*10)%3;
			switch((int)empCheck) {
			case FULL_TIME: hours = FULL_TIME_HRS;
			break;
			
			case PART_TIME: hours = FULL_TIME_HRS/2;
			break;
			
			case ABSENT: hours = 0;
			}
			totalHrs += hours;
			day++;
			System.out.println("Day "+day+": "+hours+" hours");
		}
		totalHrs = totalHrs>100 ? 100 : totalHrs;
		System.out.println("Monthly Wage = "+(totalHrs*wagePerHour));
	}
}
