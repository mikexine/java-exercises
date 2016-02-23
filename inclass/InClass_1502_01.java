package inclass;

import java.util.Scanner;

public class InClass_1502_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is today's day"); 
		String today = input.nextLine();
		System.out.println("Enter the number of days you are meeting"); 
		int numberOfDays = input.nextInt();
		int todayDay = 0;
		int day = 0;
		if (today == "Monday")
			todayDay= 1; 
		else if (today == "Tuesday")
			todayDay= 2; 
		else if (today == "Wednesday")
			todayDay= 3; 
		else if (today == "Thursday")
			todayDay= 4; 
		else if (today == "Friday")
			todayDay= 5; 
		else if (today == "Saturday")
			todayDay= 6; 
		else if (today == "Sunday")
			todayDay= 7; 
		//calculating which day will be the meeting
		day = (todayDay + numberOfDays) % 7;
		switch (day) {
			case 1: System.out.println(" You are going out on Monday"); 
			break;
			case 2: System.out.println(" Your are going out on Tuesday");  
			break;
			case 3: System.out.println(" You are going out on Wednesday");
			break;
			case 4: System.out.println("You are going out on Thursday");
			break; 
			case 5: System.out.println("You are going out on Friday"); 
			break;
			case 6: System.out.println("You are going out on Saturday"); 
			break; 
			case 0: System.out.println("You are going out on Sunday"); 
			break; 
		}  //switch
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.toLowerCase('T'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println("\b is a backspace");
		System.out.println("\t is a tab");
		System.out.println("\n is a linefeed");
		System.out.println("\f is a formfeed");
		System.out.println("\r is a carriage return");
		System.out.println("\\ is a backlash");
	}//main

}//class test

