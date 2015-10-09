package myDateChangePackage;

import java.util.Scanner;

public class DateChangeActivity {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String userDate = "", yearStr = "", monthStr = "", dateStr = "";
		int year, month, date;
		String[] usersDateArray;
		int divCounter = 0;
		System.out
				.println("Enter a date in the format of (mm-dd-yyyy). To quit, enter an empty date.");
		System.out.print("What is the date that you are asking about?    :  ");
		userDate = keyboard.nextLine();
		while (!userDate.equals("")) {

			// convert the string (date) to string array and split the values to
			// year, month, date
			usersDateArray = userDate.split("");
			for (int i = 0; i < usersDateArray.length; i++) {
				if (!usersDateArray[i].equals("-")) {
					if (divCounter == 0) {
						monthStr += usersDateArray[i];
					} else if (divCounter == 1) {
						dateStr += usersDateArray[i];
					} else if (divCounter == 2) {
						yearStr += usersDateArray[i];
					}

				} else {
					divCounter++;
				}
			}

			//set year, month and date integers to the numbers the users entered and create an object from PasDate class
			month = Integer.parseInt(monthStr);
			year = Integer.parseInt(yearStr);
			date = Integer.parseInt(dateStr);
			PastDate myDate = new PastDate(year, month -1 , date);
			
			System.out.println(myDate.printDate());
			System.out.println(myDate.dayOfTheWeek() + " "
					+ myDate.weatherCondition() + " " + myDate.numOfDays());
			System.out.println();

			System.out
					.print("What is the date that you are asking about?    :  ");
			userDate = keyboard.nextLine();

		}

		System.out.println("End of program.");
		keyboard.close();
	}
}