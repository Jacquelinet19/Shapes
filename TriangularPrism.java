import javax.swing.JOptionPane;

public class TriangularPrism {
	//attributes
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int h;
	
	// constructors
	public TriangularPrism() //no-args
	{
		x1 = 0;
		y1= 0;
		x2 = 0;
		y2 = 100;
		x3 = 100;
		y3 = 0;
		h = 100;
				
	}
	
	public TriangularPrism(int fx, int fy, int sx, int sy, int tx, int ty, int height) //args
	{
		x1 = fx;
		y1 = fy;
		x2 = sx;
		y2 = sy;
		x3 = tx;
		y3 = ty;
		h = height;
	}
	
	//accessors
	public int getX1() {return x1;}
	public int gety1() {return y1;}
	public int getx2() {return x2;}
	public int gety2() {return y2;}
	public int getx3() {return x3;}
	public int gety3() {return x3;}
	public int getHeight() {return h;}
	
	//other methods
	public String getCorner1() {return "("+x1+","+y1+")";}
	public String getCorner2() {return "("+x2+","+y2+")";}
	public String getCorner3() {return "("+x3+","+y3+")";}
	
	public double getSide1() {
		double s = 0;
		double p1 = (x1 - x3)*(x1 - x3);
		double p2 = (y1 - y3)*(y1 - y3);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	public double getSide2() {
		double s = 0;
		double p1 = (x1 - x3)*(x1 - x3);
		double p2 = (y1 - y3)*(y1 - y3);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	public double getSide3() {
		double s = 0;
		double p1 = (x2 - x3)*(x2 - x3);
		double p2 = (y2 - y3)*(y2 - y3);
		double r = p1 + p2;
		s = Math.sqrt(r);
		return s;
	}
	
	public double getVolume() 
	{
		  return (0.25*h)*Math.sqrt(-getSide1()*getSide1()*getSide1()*getSide1()-getSide2()*getSide2()*getSide2()*getSide2()-getSide3()*getSide3()*getSide3()*getSide3()+2 * (getSide1()*getSide1()*getSide2()*getSide2())+2 * (getSide1()*getSide1()*getSide3()*getSide3())+2 * (getSide3()*getSide3()*getSide2()*getSide2()));
    }
	
	public double getSurfaceArea() 
	{
		return getSide1()*h + getSide2()*h + getSide3()*h + 0.5*Math.sqrt(-getSide1()*getSide1()*getSide1()*getSide1()-getSide2()*getSide2()*getSide2()*getSide2()-getSide3()*getSide3()*getSide3()*getSide3()+2 * (getSide1()*getSide1()*getSide2()*getSide2())+2 * (getSide1()*getSide1()*getSide3()*getSide3())+2 * (getSide3()*getSide3()*getSide2()*getSide2()));
	}
	
	
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of First Corner", JOptionPane.INFORMATION_MESSAGE
				);
		x1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate First Corner", JOptionPane.INFORMATION_MESSAGE
				);
		y1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of Second Corner", JOptionPane.INFORMATION_MESSAGE
				);
		x2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate of Second Cornet", JOptionPane.INFORMATION_MESSAGE
				);
		y2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of Third Corner", JOptionPane.INFORMATION_MESSAGE
				);
		x3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate of Third Corner", JOptionPane.INFORMATION_MESSAGE
				);
		y3 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Height of Prism", JOptionPane.INFORMATION_MESSAGE
				);
		h = Integer.parseInt(input);
		
	}

	
}
