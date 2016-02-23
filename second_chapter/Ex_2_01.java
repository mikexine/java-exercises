package second_chapter;

import java.util.Scanner;

public class Ex_2_01 {

	public static void main(String[] args) {
		// exercise 2.1
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double temperature = input.nextDouble();
		System.out.printf("%.2f Celsius is %.2f Fahreneit", temperature, (9.0 / 5 * temperature + 32));
	}

}
