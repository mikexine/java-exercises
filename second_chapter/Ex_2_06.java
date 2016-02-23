package second_chapter;

import java.util.Scanner;

public class Ex_2_06 {

	public static void main(String[] args) {
		// exercise 2.6
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int oneDigit = number % 10;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = (number / 100) % 10;
		int fourthDigit = (number / 1000) % 10;
		System.out.printf("The sum of the digits is %d", (oneDigit + secondDigit + thirdDigit + fourthDigit));
	}

}
