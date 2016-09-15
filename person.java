
public class person {
	
	private String lastName;
	
	private String firstName;
	
	private address home;
	
	public person(String last, String first, address residence)
	{
		lastName = last;
		firstName = first;
		home = residence;
	}
	
	public String toString()
	{
		return(firstName + " " + lastName + ", " + home.toString());
	}

}
