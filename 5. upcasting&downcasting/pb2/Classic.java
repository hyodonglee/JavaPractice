//2016114965 이효동
package pb2;

public class Classic extends Music{
	private String composer;
	
	public Classic(String name, int year, String composer)
	{
		super(name, year);
		setComposer(composer);
	}
	
	public void setComposer(String composer)
	{
		this.composer= composer;
	}
	
	public String getComposer()
	{
		return composer;
	}
	
	public String toString()
	{
		return String.format("Classic  [곡명=%s,  연도=%d,  작곡가=%s], %s을(를) 연주합니다.", 
				super.getName(),super.getYear(),getComposer(),super.getName());
	}
	
	public String play()
	{
		return String.format("Play do: %s을(를) 연주합니다.\n",super.getName());
	}
}
