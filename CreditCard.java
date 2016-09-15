
public class CreditCard {
	
	private money balance;
	private money creditLimit;
	private person owner;
	
	
	
	public CreditCard(person newCardHolder, money limit)
	{
		owner = newCardHolder;
		balance = new money(0);
		creditLimit = new money(limit);
	}
	
	public money getBlanace()
	{
		return new money(balance);
	}
	
	public money getCreditLimit()
	{
		return new money(creditLimit);
	}
	public String getPersonals()
	{
		return owner.toString();
	}
	
	public void charge(money amount)
	{
		
		money temp = new money(balance.add(amount));
		if(temp.compareTo(creditLimit) > 0 )
		{
			System.out.println("Exceeds credit limit " );
		}
		else
		{
			balance = temp;
			System.out.println("Charge " + amount);
		}	
	}
	
	public void payment(money amount)
	{
		balance = balance.subtract(amount);
		System.out.println("Payment: " +amount);
	}
}
