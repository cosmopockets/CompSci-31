
public class CreditCardDemo {
	
	public static void main(String[] args)
	{
		
		final money LIMIT = new money(1000);
		final money FIRST_AMOUNT = new money(200);
		final money SECOND_AMOUNT = new money(10.02);
		final money THIRD_AMOUNT = new money(25);
		final money FOURTH_AMOUNT = new money(990);
		
		person owner = new person("Vitoriano", "Vital", new address("1600 Penn Ave", " Washington", "D.C.", "94551" ));
		CreditCard visa = new CreditCard(owner, LIMIT);
		System.out.println(visa.getPersonals());
		System.out.println("Balance: " +visa.getBlanace());
		System.out.println("Credit Limit: " +visa.getCreditLimit());
		System.out.println();
		System.out.println("Attempt to charge " + FIRST_AMOUNT);
		visa.charge(FIRST_AMOUNT);
		System.out.println("Balance: " + visa.getBlanace());
		visa.charge(SECOND_AMOUNT);
		System.out.println("Balance: " + visa.getBlanace());
		System.out.println("Attempt to pay " + THIRD_AMOUNT);
		visa.payment(THIRD_AMOUNT);
		System.out.println("Balance: " +visa.getBlanace());
		System.out.println("Attempt to charge " + FOURTH_AMOUNT);
		visa.charge(FOURTH_AMOUNT);
		System.out.println("Balance: " +visa.getBlanace());		
	}

}
