import javax.swing.JOptionPane;

public class Cube 
{
	// data members
	private int xTopLeft;
	private int yTopLeft;
	private int side;
	
	//constructors
	public Cube() //no-arg
	{
		xTopLeft = 100;
		yTopLeft = 100;
		side = 100;
	}
	
	public Cube(int x, int y, int s) //arg
	{
		xTopLeft = x;
		yTopLeft = y;
		side = s;
	}
	//accessors
	public int getxTopLeft() {return xTopLeft;}
	public int getyTopLeft() {return yTopLeft;}
	public int getSide() {return side;}
	// other methods
	public int getSurface() {
		return 6*(side*side);
	}
	public int getVolume() {
		return side*side*side;
	}
	
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-TopLeft Corner of Cube", JOptionPane.INFORMATION_MESSAGE
				);
		xTopLeft = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-TopLeft Corner of Cube", JOptionPane.INFORMATION_MESSAGE
				);
		yTopLeft = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Side of Cube", JOptionPane.INFORMATION_MESSAGE
				);
		side = Integer.parseInt(input);
	}
}
