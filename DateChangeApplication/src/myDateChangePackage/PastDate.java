package myDateChangePackage;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class PastDate {
	
	private GregorianCalendar myDate = new GregorianCalendar();
	
	public PastDate(){
		
	}
	public PastDate (int year, int month, int date){
		
		this.myDate.set(year, month, date);
	}
	
	public void setDate(Date newDate){
		myDate.setTime(newDate);
	}
	
	public String dayOfTheWeek(){
		int dayNum;
		String dayValue;
		
		dayNum = this.myDate.get(Calendar.DAY_OF_WEEK);
		
		if (dayNum == 1)
			dayValue = "Sunday";
		else if (dayNum == 2)
			dayValue = "Monday";
		else if (dayNum == 3)
			dayValue = "Tuesday";
		else if (dayNum == 4)
			dayValue = "Wednesday";
		else if (dayNum == 5)
			dayValue = "Thursday";
		else if (dayNum == 6)
			dayValue = "Friday";
		else 
			dayValue = "Saturday";
		
		return "That was a " + dayValue + ".";
	}

	public String numOfDays(){
		
		Date todaysDate = new Date();
		long endDateMS = todaysDate.getTime();
		
		Date tempDate = this.myDate.getTime();
		long startDateMS = tempDate.getTime();
		
		long elapsedMS = endDateMS - startDateMS ;
		long elapsedDays = elapsedMS / (24 * 60 * 60 * 1000);

		
		return "It was " + elapsedDays + " days ago.";
	}
	
	public String weatherCondition(){
		
		return "It was a sunny day and the temperature averaged 78 degrees.";
	}
	
	public String printDate(){
		
		return myDate.getTime().toString();
	}
}
