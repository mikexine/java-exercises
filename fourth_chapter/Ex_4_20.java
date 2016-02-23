package fourth_chapter;

import java.util.Scanner;

public class Ex_4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String user = input.nextLine();
		System.out.printf("- Length: %d\n- First char: %s\n", user.length(), user.charAt(0));
	}

}
