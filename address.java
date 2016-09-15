
public class address {
	
	private String street;
	
	private String city;
	
	private String state;
	
	
	private String zip; 
	
	
	public address(String road, String town, String st, String zipCode)
	{
		street = road;
		city = town;
		state = st;
		zip = zipCode;
	}
	
	public String toString()
	{
		return(street + ", " + city + ", " + state + " " + zip);
	}
	
	
}
