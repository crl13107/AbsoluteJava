package chapter6_Arrays;

import java.util.Scanner;

public class EnumDemo {

	enum WorkDay {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
	};

	public static void main(String[] args) {
		System.out.println("Sometimes you need a simple type consisting of a short list of named values.");
		System.out.println("By convention, all enums will have caps lock on, other is legal, but bad coding.");
		System.out.println("Enum is actually a class with object values.");
		System.out.println(
				"Every enumerated type has a static method name values() which returns an array whose elements are the values of the enumerated type in the order they were given.");

		WorkDay startDay = WorkDay.MONDAY;
		WorkDay endDay = WorkDay.FRIDAY;
		System.out.println("Work starts on: " + startDay);
		System.out.println("Work ends on: " + endDay);

		WorkDay[] day = WorkDay.values();

		Scanner keyboard = new Scanner(System.in);
		double hours = 0, sum = 0;
		for (int i = 0; i < day.length; i++) {
			System.out.println("Enter hours worked for " + day[i]);
			hours = keyboard.nextDouble();
			sum = sum + hours;
		}
		System.out.println("Total hours work = " + sum);
		System.out.println("Enum's can be useful for switch statements also.");
		
		keyboard.close();
	}

}
