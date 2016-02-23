package first_chapter;

public class Ex_1_10 {

	public static void main(String[] args) {
		// Exercise 1.10, runner
		System.out.println("Runs 14 km in 45 minutes and 30 seconds. Average MPH?");
		System.out.print("1 mile is 1.6 km. ");
		System.out.println("14 km are " + 14 / 1.6 + " miles");
		System.out.printf("Average MPH: %.4f", (14 / 1.6 * 3600) / (45 * 60 + 30));

	}

}
