//2016114965 ��ȿ��
public class Music{
	private String name;
	private int year;
	
	public Music(String name, int year)
	{
		SetName(name);
		SetYear(year);
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public void SetYear(int year)
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
		 return String.format( "Music  [���=%s,  ����=%d]",
				 getName(),getYear());
	}
}
