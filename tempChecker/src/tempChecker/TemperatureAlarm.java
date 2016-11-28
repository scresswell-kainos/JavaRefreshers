package tempChecker;

public class TemperatureAlarm {
	
	public static void checkTemp (double temp)
	{
		if (temp < 150.0)
		{
			System.out.println("Temperature: " + temp);
		}
		else if( temp < 200.0)
		{
			System.out.println("WARNING! Temperature: " + temp);
		}
		else if( temp < 250.0)
		{
			System.out.println("DANGER! Temperature: " + temp);
		}
		else
		{
			System.out.println("CRITICAL! Temperature: " + temp);
		}
		return;
	}
	
	public static void main(String[] args) {
		System.out.println("BASIC METHOD");
		checkTemp(110.0);
		checkTemp(149.9);
		checkTemp(150.0);
		checkTemp(150.1);
		checkTemp(198.0);
		checkTemp(202.0);
		checkTemp(222.0);
		checkTemp(266.0);
	}	
}