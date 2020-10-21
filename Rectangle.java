import javax.swing.JOptionPane;

public class Rectangle 
{
	// data members (primary attributes)
	private int xTopLeft;
	private int yTopLeft;
	private int width;
	private int height;
	
	// constructors
	public Rectangle () // no-arg constructor
	{
		xTopLeft = 0;
		yTopLeft = 0;
		width = 10;
		height = 10;
	}
	public Rectangle(int x, int y, int w, int h) 
	{
		xTopLeft = x;
		yTopLeft = y;
		width = w;
		height = h;
	}
	//accessors
	public int getxTopLeft() {return xTopLeft;}
	public int getyTopLeft() {return yTopLeft;}
	public int getWidth(){return width;}
	public int getHeight() {return height;}
	
	//Other Method(calculate secondary attributes)
	public int getPerimeter() { return 2*(width + height);}
	public int getArea() {return (getWidth() * getHeight());}
	
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-TopLeft Corner of Rectangle", JOptionPane.INFORMATION_MESSAGE
				);
		xTopLeft = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-TopLeft Corner of Rectangle", JOptionPane.INFORMATION_MESSAGE
				);
		yTopLeft = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Width of Rectangle", JOptionPane.INFORMATION_MESSAGE
				);
		width = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Height of Rectangle", JOptionPane.INFORMATION_MESSAGE
				);
		height = Integer.parseInt(input);
		
	}
}
