
public class Television {
	
	private  String MANUFACTURER;
	private  int SCREEN_SIZE;
	
	boolean powerOn;
	int channel;
	int volume;
	
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	public void setChannel(int station)
	{
		channel = station;
		
	}
	public void power(boolean onPower)
	{
		onPower = powerOn;
	}
	public void increaseVolume()
	{
		volume = volume + 1;
	}
	public void decreaseVolume()
	{
		volume = volume -1;
	}
	public int getChannel()
	{
		return channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	

}
