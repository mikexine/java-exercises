package fourth_chapter;

import java.util.Scanner;

public class Ex_4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert your SSN: ");
		String ssn = input.nextLine();
		if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
			System.out.println(ssn + " is a valid social security number");
		} else {
			System.out.println(ssn + " is an invalid social security number");
		}
	}

}
