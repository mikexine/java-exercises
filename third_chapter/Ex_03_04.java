package third_chapter;

public class Ex_03_04 {

	public static void main(String[] args) {
		// Ex 03_04
		String[] MONTHS = {"January", "February", "March", 
						   "April", "May", "June", "July", 
						   "August", "September", "October", 
						   "November", "December"};
		int number = (int)(Math.random() * 12);
		System.out.println(MONTHS[number]);
	}

}
