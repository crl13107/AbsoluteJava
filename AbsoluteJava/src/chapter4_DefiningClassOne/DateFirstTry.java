package chapter4_DefiningClassOne;

public class DateFirstTry {

	private String month;
	private int day, year;
	
	
	public void writeOutput(){
		System.out.println(month + " " + day + ", " + year);
	}
	
	public void makeItNewYears() {
		day = 1;
		month = "January";
	}
	
	public void isItNewYears(){
		if (day ==1 && month.equals("January")) {
			System.out.println("It is new Years!");
		} else {
				System.out.println("It is not new years :'(");
			}
		}
	public void setDate(int day, String month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(int year) {
		setDate(this.day,this.month,year);
	}

	public void setDay(int i) {
		this.day = i;
		
	}
	public void setMonth(String i) {
		this.month = i;
		
	}
	public void setYear(int i) {
		this.year = i;
		
	}
	}

