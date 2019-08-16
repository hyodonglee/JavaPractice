package practice1;

public class Pop extends Music{
	private String singer;
	
	public Pop(String name, int year, String singer)
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
	
	public String toString() {
		return String.format("Classic  [곡명=%s,  연도=%d,  작곡가=%s]\n",
				 super.getName(), super.getYear(), getSinger());
		}
	
	
}
