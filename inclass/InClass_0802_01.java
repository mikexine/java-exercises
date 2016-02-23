package inclass;

import java.util.Scanner; // Scanner is in the java.util package 2

public class InClass_0802_01 {

	public static void main(String[] args) { 
	  	// Create a Scanner object
	    Scanner input = new Scanner(System.in);    
		double distance = input.nextDouble();
		System.out.println(distance);
		//	String name;
		//	name = input.nextLine();
		//	System.out.println(name);
	
		// 500 seconds
		System.out.println(500 / 60 + " minutes");
		System.out.println(500 % 60 + " seconds");
	}
}