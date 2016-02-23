package fourth_chapter;

import java.util.Scanner;

public class Ex_4_22 {

	public static void main(String[] args) {
		// exercise 4.22
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string s1: ");
		String firstString = input.nextLine();
		System.out.print("Enter string s2: ");
		String secondString = input.nextLine();
		
		if (firstString.contains(secondString)) {
			System.out.printf("%s is a substring of %s", secondString, firstString);
		} else {
			System.out.printf("%s is not a substring of %s", secondString, firstString);
		}
	}

}
