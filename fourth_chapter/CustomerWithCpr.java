package fourth_chapter;

import java.util.Scanner;

public class CustomerWithCpr {

	public static void main(String[] args) {
		// CPR, telephone check + deliver?
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter your CPR number: ");
		String cpr = input.nextLine();
		while (!cpr.matches("\\d{6}-\\d{4}")) {
			System.out.print("Wrong format. Enter your CPR number again (format is 123456-7890): ");
			cpr = input.nextLine();
		}
		
		System.out.print("Enter your danish phone number: ");
		String phone = input.nextLine();
		while (!phone.matches("\\d{8}")) {
			System.out.print("Wrong format. Enter your danish phone number again (8 digits): ");
			phone = input.nextLine();
		}
		
		System.out.print("Enter your house number: ");
		String houseNumber = input.nextLine();
		System.out.print("Enter your street name: ");
		String street = input.nextLine();
		
		System.out.print("Enter your danish post code: ");
		String postCodeString = input.nextLine();
		while (!postCodeString.matches("\\d{4}")) {
			System.out.print("Wrong format. Enter your danish post code number again (4 digits): ");
			postCodeString = input.nextLine();
		}
		
		int postCode = Integer.parseInt(postCodeString);
		
		if (postCode <= 2500) {
			System.out.printf("\nDear %s %s, great news! We can delivery to your address!", firstName, lastName);
		} else {
			System.out.printf("\nDear %s %s, we're sorry! Unfortunately, we cannot deliver to your address!", firstName, lastName);
		}
		input.close();
	}

}