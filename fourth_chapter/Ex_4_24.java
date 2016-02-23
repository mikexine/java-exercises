package fourth_chapter;

import java.util.Scanner;

public class Ex_4_24 {

	public static void main(String[] args) {
		// exercise 4.24
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String cityOne = input.nextLine();
		System.out.print("Enter the second city: ");
		String cityTwo = input.nextLine();
		System.out.print("Enter the third city: ");
		String cityThree = input.nextLine();
		String tmp = "";
		if (cityOne.compareToIgnoreCase(cityTwo) > 0) {
			tmp = cityOne;
			cityOne = cityTwo;
			cityTwo = tmp;
		}
		if (cityTwo.compareToIgnoreCase(cityThree) > 0) {
			tmp = cityTwo;
			cityTwo = cityThree;
			cityThree = tmp;
		}
		if (cityOne.compareToIgnoreCase(cityTwo) > 0) {
			tmp = cityOne;
			cityOne = cityTwo;
			cityTwo = tmp;
		}
		System.out.println(cityOne + " " + cityTwo + " " + cityThree);
	}

}