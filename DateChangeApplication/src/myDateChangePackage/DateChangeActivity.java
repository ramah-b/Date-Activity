package myDateChangePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Updated the program so that it converts the date string entered into a Date
 * object, and the sets this object to the object instance created from type
 * PastDate
 * 
 * 
 * 
 * @author GBTC440002UR
 *
 */
public class DateChangeActivity {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String userDate = "";
		// String yearStr = "", monthStr = "", dateStr = "";
		// int year, month, date;
		// String[] usersDateArray;
		// int divCounter = 0;
		System.out
				.println("Enter a date in the format of (mm/dd/yyyy). To quit, enter an empty date.");
		System.out.print("What is the date that you are asking about?    :  ");
		userDate = keyboard.nextLine();
		while (!userDate.equals("")) {

			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

			try {

				Date newDate = formatter.parse(userDate);
				PastDate myDate = new PastDate();
				myDate.setDate(newDate);

				// System.out.println(myDate.printDate());
				System.out.println(myDate.dayOfTheWeek() + " "
						+ myDate.weatherCondition() + " " + myDate.numOfDays());
				System.out.println();

			} catch (ParseException e) {
				//e.printStackTrace();
				System.out.println("Please enter a date (mm/dd/yyyy).");
				System.out.println();
			}

			// convert the string (date) to string array and split the values to
			// year, month, date
			/*
			 * usersDateArray = userDate.split(""); for (int i = 0; i <
			 * usersDateArray.length; i++) { if (!usersDateArray[i].equals("-"))
			 * { if (divCounter == 0) { monthStr += usersDateArray[i]; } else if
			 * (divCounter == 1) { dateStr += usersDateArray[i]; } else if
			 * (divCounter == 2) { yearStr += usersDateArray[i]; }
			 * 
			 * } else { divCounter++; } }
			 */

			// set year, month and date integers to the numbers the users
			// entered and create an object from PasDate class
			// month = Integer.parseInt(monthStr);
			// year = Integer.parseInt(yearStr);
			// date = Integer.parseInt(dateStr);
			// PastDate myDate = new PastDate(year, month -1 , date);

			System.out
					.print("What is the date that you are asking about?    :  ");
			userDate = keyboard.nextLine();

		}

		System.out.println("End of program.");
		keyboard.close();
	}
}