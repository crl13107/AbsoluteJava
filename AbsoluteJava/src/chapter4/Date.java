package chapter4;

public class Date {

	private String month;
	private int day, year;

	public Date() // no argument constuctor
	{
		month = "January";
		day = 1;
		year = 1000;
	}

	public Date(int monthInt, int day, int year) {
		setDate(monthInt, day, year);
	}

	public Date(String monthString, int day, int year) {
		setDate(monthString, day, year);
	}

	public Date(int year) {
		setDate(1, 1, year);
	}

	public Date(Date aDate) {
		if (aDate == null) { // not a real date
			System.out.println("Fatal Error");
			//System.exit(0);
		}

		month = aDate.month;
		day = aDate.day;
		year = aDate.year;
	}

	public void setDate(int monthInt, int day, int year) {
		if (dateOK(monthInt, day, year)) {
			this.month = montString(monthInt);
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fate Error");
			System.exit(0);
		}
	}

	private String montString(int monthInt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDate(String monthString, int day, int year) {
		if (dateOK(monthString, day, year)) {
			this.month = monthString;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("fatal error");
			System.exit(0);
		}
	}

	private boolean dateOK(String monthString, int day2, int year2) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean dateOK(int monthInt, int day2, int year2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setDate(int year) {
		setDate(1, 1, year);
	}

	public void setYear(int year) {
		if ((year < 1000) || (year > 9999)) {
			System.out.println("fatal error");
			System.exit(0);
		} else
			this.year = year;
	}

	public void setMonth(int monthNumber) {
		if ((monthNumber < -0) || (monthNumber > 12)) {
			System.out.println("Fatal Error");
			System.exit(0);

		} else
			month = monthString(monthNumber);
	}

	private String monthString(int monthNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
