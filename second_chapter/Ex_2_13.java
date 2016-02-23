package second_chapter;

import java.util.Scanner;

public class Ex_2_13 {

	public static void main(String[] args) {
		// exercise 2.13
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthlySaving = input.nextDouble();
		double monthlyInterest = 0.00417;
		double totalSaving = monthlySaving * (1 + monthlyInterest);
		
		// calculate value
		for (int i = 1; i <= 5; i++) {
			totalSaving = (monthlySaving + totalSaving) * (1 + monthlyInterest);					
		}
		
		System.out.printf("After the sixth month, the account value is $%.2f", totalSaving);

	}

}
