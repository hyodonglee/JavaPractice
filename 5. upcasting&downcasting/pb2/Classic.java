//2016114965 ��ȿ��
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
		return String.format("Classic  [���=%s,  ����=%d,  �۰=%s], %s��(��) �����մϴ�.", 
				super.getName(),super.getYear(),getComposer(),super.getName());
	}
	
	public String play()
	{
		return String.format("Play do: %s��(��) �����մϴ�.\n",super.getName());
	}
}
