//2016114965 ��ȿ��
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
		return String.format("Classic  [���=%s,  ����=%d,  �۰=%s]", 
				super.getName(),super.getYear(),getComposer());
	}
}
