package third_chapter;

import java.util.Scanner;

public class Ex_3_30 {

	public static void main(String[] args) {
		// exercise 2.8
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		long currentHour = totalHours % 24;
		
		int offsetHour = (int)(currentHour + offset);
		System.out.println(offsetHour);
		String ampm = "AM";
		
		if (offsetHour >= 12 && offsetHour != 24) {
			if (offsetHour > 12) {
				offsetHour -= 12;
			}
			ampm = "PM";
		} 
		if (offsetHour == 24) {
			offsetHour = 0;
		}
		
		System.out.printf("The current time is: %02d:%02d:%02d %s", offsetHour, currentMinute, currentSecond, ampm);

	}

}