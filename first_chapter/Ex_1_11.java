package first_chapter;

public class Ex_1_11 {

	public static void main(String[] args) {
		// exercise 1.11, calculate US population
		int days = 365;
		int births = 7;
		int deaths = 13;
		int immigrants = 45;
		int current = 312032486;
		int seconds = days * 24 * 60;
		int plusBorn = seconds / births;
		int plusImm = seconds / immigrants;
		int minDeath = seconds / deaths;
		System.out.printf("%-28s %6d.\n", "Yearly number of newborns:", plusBorn);
		System.out.printf("%-28s %6d.\n", "Yearly number of immigrants:", plusImm);
		System.out.printf("%-28s %6d.\n\n", "Yearly number of deaths:", minDeath);
		int increase = plusBorn + plusImm - minDeath;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Year %d. Current population: %d\n", i, current );
			current = current + increase;
		}

	}

}
