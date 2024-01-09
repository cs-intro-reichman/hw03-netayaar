/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sunday = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		String YearInput = args[0];
        int yearInput = Integer.parseInt(YearInput);
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		while (dayOfMonth != 31 || month != 12 || year != (yearInput)) {
			advance();
	 		debugDaysCounter++;

            if (year == yearInput) {
                if (dayOfWeek == 1) {
                    sunday++;
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
                }
                else {
                System.out.println(dayOfMonth + "/" + month + "/" + year);
            }
	
			}
		}
    }
		
	 private static void advance() {
		if (dayOfWeek == 7) {
			dayOfWeek = 1;
		}
		else {
			dayOfWeek++;
		}
		if (month == 12 && dayOfMonth == 31) {
			month = 1;
			dayOfMonth = 1;
			year++;
		}
		else if (dayOfMonth == nDaysInMonth) {
			month++;
			nDaysInMonth = nDaysInMonth(month, year);
			dayOfMonth = 1;
		}
		else {
			dayOfMonth++;
		}


	} 
	public static int nDaysInMonth(int month, int year) {
		// Replace the following statement with your code
		int days = 31;
		switch (month) {
			case 2:
				if (isLeapYear(year)) {
					days = 29;	
				} else {
					days = 28;
				}
				break;
			case 4:
				days = 30;
				break;
			case 6:
				days = 30;
				break;
			case 9:
				days = 30;
				break;
			case 11:
				days = 30;
				break;
		}
		return days;
	}
    // Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    // Replace the following statement with your code
		boolean isLeap = false ;
		isLeap = ((year % 400) == 0);
		isLeap = isLeap || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeap;
	}
}

