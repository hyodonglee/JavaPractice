package practice1;

public class Classic extends Music {
	private String composer;
	
	public Classic(String name, int year, String composer)
	{
		super(name, year);
		setComposer(composer);
	}
	
	public void setComposer(String composer)
	{
		this.composer = composer;
	}
	
	public String getComposer()
	{
		return composer;
	}
	
	public String toString() {
	return String.format("Classic  [곡명=%s,  연도=%d,  작곡가=%s]\n",
			 super.getName(), super.getYear(), getComposer());
	}
	
}
