//2016114965 ��ȿ��
package pb2;

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
		return String.format("Pop  [���=%s,  ����=%d,  ����=%s], %s��(��) �����մϴ�.", 
				super.getName(),super.getYear(),getSinger(),super.getName());
	}
	public String play()
	{
		return String.format("Play do: %s��(��) �����մϴ�.\n",super.getName());
	}
}
