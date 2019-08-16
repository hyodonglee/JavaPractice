package practice1;

public class Music {
	protected String name;
	protected int year;
	
	public Music(String name, int year)
	{
		setName(name);
		setYear(year);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getYear()
	{
		return year;
	}
	

	
	public String toString()
	{
		return String.format("Music  [곡명=%s,  연도=%d]\n",
				 getName(), getYear());
	}
}
