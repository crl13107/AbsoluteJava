package chapter8_PolymorphismAbstract;

public class Sale {

	private String name;
	private double price;

	public Sale() {
		price = 0;
		name = "No name yet";
	}

	public Sale(String theName, double thePrice) {
		setName(theName);
		setPrice(thePrice);
	}

	public Sale(Sale originalObject) {
		if (originalObject == null) {
			System.out.println("Error; null sale object");
			System.exit(0);
		}
		name = originalObject.name;
		price = originalObject.price;
	}

	public static void announcement() {
		System.out.println("This is the Sale class");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return (name + " Price and total cost = $" + price);
	}

	public double bill() {
		return price;
	}

	public boolean equalDeals(Sale otherSale) {
		if (otherSale == null)
			return false;
		else
			return name.equals(otherSale.name) && bill() == otherSale.bill();
	}

	public boolean lessThan(Sale otherSale) {
		if (otherSale == null)
			System.exit(0);
		return bill() < otherSale.bill();
	}


	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Sale otherSale = (Sale) otherObject;
			return (name.equals(otherSale.name) && (price == otherSale.price));
		}
	}
}
