package com.bridgelabz.EmployeeWageCalc;

public class EmployeeWageCalc {
	public static final int FULL_TIME_HRS = 8;
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_TIME = 2;
	public static final int PART_TIME = 1;
	public static final int ABSENT = 0;
	
	public static void main(String[] args) {
		
		int totalHrs = 0,i=0;
		int noOfDays = 20, maxHrs = 100;		
		while(totalHrs < 100 && i < noOfDays) {
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
			i++;
			System.out.println("Day "+i+": "+hours+" hours");
		}
		totalHrs = totalHrs>100 ? 100 : totalHrs;
		System.out.println(i+" "+totalHrs+" Monthly Wage = "+(totalHrs*WAGE_PER_HOUR));		
	}
}
