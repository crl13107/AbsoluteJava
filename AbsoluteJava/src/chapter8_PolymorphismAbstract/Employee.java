package chapter8_PolymorphismAbstract;

import chapter4.Date;

public abstract class Employee {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private Date hireDate;

	public abstract double getPay();

	public Employee() {
		name = "No name";
		hireDate = new Date("January", 1, 1999);
	}

	public boolean samePay(Employee other) {
		if (other == null) {
			System.out.println("errot");
			System.exit(0);
		}
		return (this.getPay() == other.getPay());
	}

	class SalariedEmployee extends Employee {
		private double salary;

		public SalariedEmployee(double salary) {
			this.salary = salary;

		}

		public double getPay() {
			return salary / 12;
		}
	}

	class HourlyEmployee extends Employee {

		private double wageRate;
		private double hour;

		public double getPay() {
			return wageRate * hour;
		}

		public boolean equals(Object otherObject) {
			if (otherObject == null)
				return false;
			else if (getClass() != otherObject.getClass())
				return false;
			else {
				HourlyEmployee otherHourlyEmployee = (HourlyEmployee) otherObject;
				return (super.equals(otherHourlyEmployee)) && (wageRate == otherHourlyEmployee.wageRate)
						&& (hour == otherHourlyEmployee.hour);

			}
		}
	}
}

class Idk {
	public static void main(String[] args) {
		Employee ABC = new Employee() {

			@Override
			public double getPay() {
				// TODO Auto-generated method stub
				return 0;
			}

		};
		System.out.println(ABC.getPay());
	}
}
