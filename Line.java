import javax.swing.JOptionPane;

public class Line {
	// data members (primary attributes)
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	// constructors
	public Line(int a, int b, int c, int d) {
		x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
	}
	
	public Line() {
		x1 = 10;
		y1= 10;
		x2 = -10;
		y2 = -10;
	}
	
	//accessors
	public int getx1() {return x1;}
	public int gety1() {return y1;}
	public int getx2() {return x2;}
	public int gety2() {return y2;}
	
	//Other Method(calculate secondary attributes)
	public String getFirstPoint() {return "( "+x1+", "+y1+" )";}
	public String getSecondPoint() {return "( "+x2+", "+y2+" )";}
	public double getLength() {
		double l = 0;
		double p1 = (x2 - x1)*(x2 - x1);
		double p2 = (y2 - y1)*(y2 - y1);
		double r = p1 + p2;
		l = Math.sqrt(r);
		return l;
	}
	
	public void getAttributes()
	{
		String input;
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of First Point", JOptionPane.INFORMATION_MESSAGE
				);
		x1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate of First Point", JOptionPane.INFORMATION_MESSAGE
				);
		y1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"X-Coordinate of Second Point", JOptionPane.INFORMATION_MESSAGE
				);
		x2 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null,
				"Please Enter a Positive Integer",
				"Y-Coordinate of Second Point", JOptionPane.INFORMATION_MESSAGE
				);
		y2 = Integer.parseInt(input);
		
	}

}
