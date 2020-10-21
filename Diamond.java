import javax.swing.JOptionPane;

public class Diamond {
	//attributes
	private int x;
	private int y;
	private int w;
	private int h;
	
	//Constructors
	public Diamond() // no args 
	{
		x = 10;
		y = 10;
		w = 10;
		h = 10;
	}
	
	public Diamond(int x1, int y1, int width, int height) //args
	{
		x = x1;
		y = y1;
		w = width;
		h = height;
	}
	
	//accesssors
	public int getX() {return x;}
	public int getY() {return y;}
	public int getHeight() {return h;}
	public int getWidth() {return w;}
	
	//Other methods
	public String getCenter() {return "("+x+","+y+")";}
	public double getPerimeter() {
		double py = ((w/2)*(w/2))+((h/2)*(h/2));
		double h = Math.sqrt(py);
		double p = h*4;
		return p;
	}
	public double getArea() {
		return w*h*.5;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of Center of Diamond", JOptionPane.INFORMATION_MESSAGE
				);
		x = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate of Center of Diamond", JOptionPane.INFORMATION_MESSAGE
				);
		y = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Width of Diamond", JOptionPane.INFORMATION_MESSAGE
				);
		w = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Height of Diamond", JOptionPane.INFORMATION_MESSAGE
				);
		h = Integer.parseInt(input);
		
	}
}
