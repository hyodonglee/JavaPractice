//2016114965 ��ȿ��
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
		return String.format("Pop  [���=%s,  ����=%d,  ����=%s]", 
				super.getName(),super.getYear(),getSinger());
	}
}
