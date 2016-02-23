package inclass;

import java.util.Scanner; // Scanner is in the java.util package 2

public class InClass_0802_02 {
	
	public static void main(String[] args) { 
		int speed = 65;
		int hours = 0;
		int minutes = 0; 
		int seconds = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input distance in KM: ");
		double distance = input.nextDouble();
		double time = distance / speed;
		hours = (int)time;
		System.out.print(hours + ":");
		minutes = (int)(time % 1 * 60);
		System.out.print(minutes + ":");
		
	}

}
