package practice1;


public class Rectangle{
	private int x;
	private int y;
	private int height;
	private int width;
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	//set
	
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return height;
	}
	
	// get
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		x = x1;
		y = y1;
		height = x2 - x1;
		width = y2 - y1;
	}
	
	
	public Rectangle(int x1, int y1, int size) {
		x = x1;
		y = y1;
		height = size;
		width = size;
	}
	
	
	public int getArea()
	{
		return height*width;
	}
	
	public void print()
	{
		System.out.printf("(%d, %d), %d, %d\n",x,y,height, width);
	}
	
	public void move(int dx, int dy)
	{
		x+=dx;
		y+=dy;
	}
	
	public void change(int delta) {
		height+=delta;
		width+=delta;
	}
	
	public void change(int dh, int dw) {
		height += dh;
		width += dw;
	}
	
	
}
