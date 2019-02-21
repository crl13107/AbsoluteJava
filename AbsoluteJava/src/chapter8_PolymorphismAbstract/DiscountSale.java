package chapter8_PolymorphismAbstract;

public class DiscountSale extends Sale {

	private double discount;

	public DiscountSale() {
		super();
		discount = 0;
	}

	public DiscountSale(DiscountSale originalObject) {
		super(originalObject);
		discount = originalObject.discount;
	}

	public DiscountSale(String theName, double thePrice, double theDiscount) {
		super(theName, thePrice);
		setDiscount(theDiscount);
	}

	public void announcement() {
		System.out.println("This is the discountsale class");
	}

	public double bill() {
		double fraction = discount / 100;
		return (1 - fraction) * getPrice();
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double newDiscount) {
		if (newDiscount >= 0)
			discount = newDiscount;
		else {
			System.out.println("Negative disscount");
			System.exit(0);
		}
	}

	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "Total cost = $" + bill());
	}

	public  DiscountSale clone() {
		return new DiscountSale(this);
	}
}
