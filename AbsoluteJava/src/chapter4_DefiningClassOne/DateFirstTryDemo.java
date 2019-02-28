package chapter4_DefiningClassOne;

public class DateFirstTryDemo {

	public static void main(String[] args) {
		DateFirstTry date1, date2;
		date1 = new DateFirstTry();
		date2 = new DateFirstTry();
		date1.setMonth("December");
		date1.setDay(31);
		date1.setYear(1995);
		System.out.print("date1: ");
		date1.writeOutput();
		date1.setDate(1000);
		date1.writeOutput();
		
		date2.isItNewYears();

		date2.makeItNewYears();
		date2.writeOutput();
		date2.isItNewYears();

		DateFirstTry date3 = new DateFirstTry();
		date3.setDate(3, "Jan", 1995);
		date3.writeOutput();
		date3.isItNewYears();
	}
}
