package third_chapter;

import java.util.Scanner;

public class Ex_3_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.printf("Is %d divisible by 5 and 6? %s\n", number, (number % 5 == 0 && number % 6 == 0));
		System.out.printf("Is %d divisible by 5 or 6? %s\n", number, (number % 5 == 0 || number % 6 == 0));
		System.out.printf("Is %d divisible by 5 or 6, but not both? %s\n", number, (number % 5 == 0 ^ number % 6 == 0));
	}

}