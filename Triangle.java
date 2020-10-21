import javax.swing.JOptionPane;

public class Triangle {
	// data members
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	//constructors
	public Triangle() //no args
	{
		x1 = 0;
		y1 = 10;
		x2 = -10;
		y2 = 0;
		x3 = 10;
		y3 = 0;
	}
	
	public Triangle(int fx, int fy, int sx, int sy, int tx, int ty) //args 
	{
		x1 = fx;
		y1 = fy;
		x2 = sx;
		y2 = sy;
		x3 = tx;
		y3 = ty;
	}
	
	//accessors
	public int getx1() {return x1;}
	public int gety1() {return y1;}
	public int getx2() {return x2;}
	public int gety2() {return y2;}
	public int getx3() {return x3;}
	public int gety3() {return y3;}
	
	// Other methods
	public String getFirstPoint() {return "("+x1+","+y1+")";}
	public String getSecondPoint() {return "("+x2+","+y2+")";}
	public String getThirdPoint() {return "("+x3+","+y3+")";}
	public double getSide1() {
		double s = 0;
		double p1 = (x1 - x2)*(x1 - x2);
		double p2 = (y1 - y2)*(y1 - y2);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	public double getSide3() {
		double s = 0;
		double p1 = (x1 - x3)*(x1 - x3);
		double p2 = (y1 - y3)*(y1 - y3);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	public double getSide2() {
		double s = 0;
		double p1 = (x2 - x3)*(x2 - x3);
		double p2 = (y2 - y3)*(y2 - y3);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	public double getPerimeter() {
		return (Math.sqrt(((x1 - x2)*(x1-x2)+(y1 - y2)*(y1-y2)))+Math.sqrt(((x2 - x3)*(x2-x3)+(y2 - y3)*(y2-y3)))+Math.sqrt(((x1 - x3)*(x1-x3)+(y1 - y3)*(y1-y3))));
	}
	public double getArea() {
		return ((y3 - y1)*getSide2())/2;
	}
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter the X-Coordinate of the First Point",
				"X-Coordinate of First Point", JOptionPane.INFORMATION_MESSAGE
				);
		x1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter Y-Coordinate of the First Point",
				"Y-Coordinate of First Point", JOptionPane.INFORMATION_MESSAGE
				);
		y1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter the X-Coordinate of the Second Point",
				"X-Coordinate of Second Point", JOptionPane.INFORMATION_MESSAGE
				);
		x2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter Y-Coordinate of the Second Point",
				"Y-Coordinate of Second Point", JOptionPane.INFORMATION_MESSAGE
				);
		y2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter the X-Coordinate of the Third Point",
				"X-Coordinate of Third Point", JOptionPane.INFORMATION_MESSAGE
				);
		x3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter Y-Coordinate of the Third Point",
				"Y-Coordinate of Third Point", JOptionPane.INFORMATION_MESSAGE
				);
		y3 = Integer.parseInt(input);
		
	}
	
}
