package practice1;

public class CurrencyConverter {
	static double rate;
	
	public CurrencyConverter(double rate){
		this.rate = rate;
	}
	
	static double toDollar(double won)
	{
		return won/rate;
	}
	
	static double toKWR(double dollar) 
	{
		return dollar*rate;
	}
}
