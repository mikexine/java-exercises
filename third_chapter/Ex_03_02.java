package third_chapter;

import java.util.Scanner;

public class Ex_03_02 {

	public static void main(String[] args) {
		// exercise 03_02
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 3 % 10);
		
		 // Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
		(number1 + number2 + number3 == answer));
	}

}
