
public class money {
	
	private long dollars;
	
	private long cents;
	
	
	public money(double amount)
	{
		if (amount < 0)
		{
			System.out.println("Error: Negative numbers are not allowed."); System.exit(0);
		}
		else
		{
			long allCents = Math.round(amount*100);
			dollars = allCents/100;
			cents = allCents%100;
		}
	}
	
	public money add( money otherAmount)
	{
		money sum = new money(0);
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents / 100;
		sum.cents = sum.cents % 100;
		sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
		return sum;
	}
	
	public money subtract(money amount)
	{
		money difference = new money(0);
		if(this.cents < amount.cents)
		{
			this.dollars = this.dollars - 1;
			this.cents = this.cents + 100;
			
		}
		difference.dollars = this.dollars - amount.dollars;
		difference.cents = this.cents - amount.cents;
		return difference;
	}
	
	
	public int compareTo(money amount)
	{
		int value;
		
		if(this.dollars < amount.dollars)
		{
			value = -1;
		}
		else if (this.dollars > amount.dollars)
		{
			value = 1;
		}
		else if (this.cents < amount.cents)
		{
			value = -1;
		}
		else if(this.cents > amount.cents)
		{
			value = 1;
		}
		else
		{
			value = 0;
		}
		return value;
	}

}
