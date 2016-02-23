package second_chapter;

import java.math.*;

public class Ex_2_18 {

	public static void main(String[] args) {
		// exercise 2.18
		System.out.println("a      b      pow(a, b)");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%d      %d      %d\n", i, i+1, (int)Math.pow(i, i+1));					
		}
	}

}
