package zChapter13_Interfaces_InnerClasses;

public class BankAccount {

	private class Money {
		private long dollars;
		private int cents;

		public Money(String stringAmount) {
			abortOnNull(stringAmount);
			int length = stringAmount.length();
			dollars = Long.parseLong(stringAmount.substring(0, length - 3));
			cents = Integer.parseInt(stringAmount.substring(length - 2));
		}

		public String getAmount() {
			if (cents > 9)
				return (dollars + "." + cents);
			else
				return (dollars + ".0" + cents);
		}

		public void addIn(Money secondAmount) {
			abortOnNull(secondAmount);
			int newCents = (cents + secondAmount.cents) % 100;
			long carry = (cents + secondAmount.cents) / 100;
			cents = newCents;
			dollars = dollars + secondAmount.dollars + carry;
		}

		private void abortOnNull(Object o) {
			if (o == null) {
				System.out.println("Unexpected null argument.");
				System.exit(0);
			}
		}
	}

	private Money balance;

	public BankAccount() {
		balance = new Money("0.00");
	}

	public String getBalance() {
		return balance.getAmount();
	}

	public void makeDeposit(String despositAmount) {
		balance.addIn(new Money(despositAmount));
	}

	public void closeAccount() {
		balance.dollars = 0;
		balance.cents = 0;
	}

	public static void main(String[] args) {
		System.out.println("Creating a new account.");
		BankAccount account = new BankAccount();
		System.out.println("Account balance now = $" + account.getBalance());
		
		System.out.println("Deposit 100");
		account.makeDeposit("100.00");
		System.out.println("Account balance now = $"+account.getBalance());
		
		System.out.println("Deposit 99.99");
		account.makeDeposit("99.99");
		System.out.println("Account balance now = $"+account.getBalance());
		
		System.out.println("Deposit 0.01");
		account.makeDeposit("0.01");
		System.out.println("Account balance now = $"+account.getBalance());
		
		System.out.println("Closing account");
		account.closeAccount();
		System.out.println("Account balance now = $"+account.getBalance());
	}
}
