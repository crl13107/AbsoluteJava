package zChapter13_Interfaces_InnerClasses;

import chapter8_PolymorphismAbstract.HourlyEmployee;

public class OrderedHourlyEmployee extends HourlyEmployee implements Ordered {

	@Override
	public boolean precedes(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof OrderedHourlyEmployee))
			return false;
		else {
			OrderedHourlyEmployee otherOrderedHourlyEmployee = (OrderedHourlyEmployee) other;
			return (getPay() < otherOrderedHourlyEmployee.getPay());
		}
	}

	@Override
	public boolean foolows(Object other) {
		if (other == null)
			return false;
		else if (!(other instanceof OrderedHourlyEmployee))
		return false;
		else {
			OrderedHourlyEmployee otherHourlyEmployee = (OrderedHourlyEmployee)other;
			return (otherHourlyEmployee.precedes(this));
		}
	}

}
