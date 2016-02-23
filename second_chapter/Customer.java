package second_chapter;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		int meal = 500;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name and surname: ");
		String name = input.nextLine();
		System.out.print("Enter your date of birth: ");
		String dateOfBirth = input.nextLine();
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		System.out.print("Enter the % tip: ");
		double tip = input.nextDouble();
		
		double tipAmount = meal * tip / 100;
		 
		System.out.println("Output: ");
		System.out.println("");
		System.out.printf(""
				+ "|-----------------------------------------|\n"
				+ "| Name:          %-25s|\n"
				+ "| Date of Birth: %-25s|\n"
				+ "| Address:       %-25s|\n"
				+ "|                                         |\n"
				+ "|-----------------------------------------|\n"
				+ "|                                         |\n"
				+ "| Cost of meal:  %-25d|\n"
				+ "| Tip amount:    %-25.2f|\n"
				+ "| Total bill:    %-25.2f|\n"
				+ "|-----------------------------------------|", 
				name, dateOfBirth, address, meal, tipAmount, meal + tipAmount);

	}

}
