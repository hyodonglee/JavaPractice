//2016114965 이효동
public class Pop extends Music{
	private String singer;
	
	public Pop(String name,int year,String singer)
	{
		super(name, year);
		setSinger(singer);
	}
	
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	
	public String getSinger()
	{
		return singer;
	}
	
	public String toString()
	{
		return String.format("Pop  [곡명=%s,  연도=%d,  가수=%s]", 
				super.getName(),super.getYear(),getSinger());
	}
}
