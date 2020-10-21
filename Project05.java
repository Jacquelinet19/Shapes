import javax.swing.JOptionPane;

public class Project05
{
	public static void main(String[] args) 
	{
		menu();
	}
	public static void menu()
	{
			String input;
			int option = 8;
			while(option != 7) 
			{
			input = JOptionPane.showInputDialog(null,
					"             Geometric Shapes"+"\n"+
							"______________________________"+"\n"+
							"      Select a Shape by Entering"+"\n"+
							"the Number Associated with Shape"+"\n"+
							"      Press 7 to Exit the Program"+"\n"+
							"______________________________"+"\n"+
							"         Two-Dimensional Shapes"+"\n"+
							"______________________________"+"\n"+
							"                  1. Line "+"\n"+
							"                  2.Triangle"+"\n"+
							"                  3. Rectangle"+"\n"+
							"                  4. Diamond"+"\n"+
							"______________________________"+"\n"+
							"        Three-Dimensional Shapes"+"\n"+
							"______________________________"+"\n"+
							"                  5. Triangular Prism"+"\n"+
							"                  6. Cube"+"\n"+
							"______________________________"+"\n"+
							"                  7. EXIT"+"\n"
							,
							"CSC229 - Project 05 - Shapes", JOptionPane.INFORMATION_MESSAGE
			);
			option = Integer.parseInt(input);
			
			//This part allows the program to select what method to perform
			switch(option)
			{
				case 1: //line
				{
					Line l = new Line();
					l.getAttributes();
					displayResult(option , l);
					break;
				}
				case 2: //triangle
				{
					Triangle t = new Triangle();
					t.getAttributes();
					displayResult(option, t);
					break;
				}
				case 3: // Rectangle
				{
					Rectangle r = new Rectangle();
					r.getAttributes();
					displayResult(option, r);
					break;
				}
				case 4:
				{
					Diamond d = new Diamond();
					d.getAttributes();
					displayResult(option, d);
					break;
				}
				case 5:
					TriangularPrism tp = new TriangularPrism();
					tp.getAttributes();
					displayResult(option, tp);
					break;
				case 6: //cube
				{
					Cube c = new Cube();
					c.getAttributes();
					displayResult(option, c);
					break;
				}
				case 7: //Exit
				{
					JOptionPane.showMessageDialog(null,
					"Good Bye",
					"Thank You for Using Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
					break;
				}	
				default:
				{
					JOptionPane.showMessageDialog(null,
							"Please Enter a Number between 1 and 7",
							"ERROR",JOptionPane.ERROR_MESSAGE);
					break;
				}
			
			  } // end of switch
			} // end while
	}
	public static void displayResult(int optionSelected,Object o) 
	{
		switch(optionSelected) 
		{
			case 1:
			{
				Line tl = (Line) o;
				JOptionPane.showMessageDialog(null,
						"                     Line Properties"+"\n"+
						"___________________________________"+"\n"+
						"             First Point = "+tl.getFirstPoint()+"\n"+
						"        Second Point = "+tl.getSecondPoint()+"\n"+
						"                   Lenght = "+tl.getLength()+"\n"
						+"__________________________________",
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);
				break;
			}
			case 2:
			{
				Triangle tt = (Triangle) o;
				JOptionPane.showMessageDialog(null,
						"                  Triangle Properties"+"\n"+
						"___________________________________"+"\n"+
						"                    First Point = "+tt.getFirstPoint()+"\n"+
						"               Second Point = "+tt.getSecondPoint()+"\n"+
						"                   Third Point = "+tt.getThirdPoint()+"\n"+
						"                            Side 1 = "+tt.getSide1()+"\n"+
						"                            Side 2 = "+tt.getSide2()+"\n"+
						"                            Side 3 = "+tt.getSide3()+"\n"+
						"                     Perimeter = "+tt.getPerimeter()+"\n"+
						"                              Area = "+tt.getArea()+"\n"+
						"___________________________________"
						,
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);
				break;
			}
			case 3:
			{
				Rectangle tr = (Rectangle) o;
				JOptionPane.showMessageDialog(null,
						"         Rectangle Properties"+"\n"+
						"___________________________________"+"\n"+
						"      TopLeft Corner = ("+tr.getxTopLeft()+","+tr.getyTopLeft()+")"+"\n"+
						"                      Width = "+tr.getWidth()+"\n"+
						"                     Height = "+tr.getHeight()+"\n"+
						"               Perimeter = "+tr.getPerimeter()+"\n"+
						"                        Area = "+tr.getArea()+"\n"
						+"__________________________________",
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);
				break;
			}
			case 4:
			{
				Diamond td = (Diamond) o;
				JOptionPane.showMessageDialog(null,
						"         Diamond Properties"+"\n"+
						"___________________________________"+"\n"+
						"                  Center ="+td.getCenter()+"\n"+
						"                  Height = "+td.getHeight()+"\n"+
						"                   Width = "+td.getWidth()+"\n"+
						"            Perimeter = "+td.getPerimeter()+"\n"+
						"                     Area = "+td.getArea()+"\n",
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);

				break;
			}
			case 5:
			{
				TriangularPrism ttp = (TriangularPrism) o;
				JOptionPane.showMessageDialog(null,
						"                    Prism Properties"+"\n"+
						"___________________________________"+"\n"+
						"           Base Corner 1 ="+ttp.getCorner1()+"\n"+
						"           Base Corner 2 = "+ttp.getCorner2()+"\n"+
						"           Base Corner 3 ="+ttp.getCorner3()+"\n"+
						"                         Height = "+ttp.getHeight()+"\n"+
						"                       Surface = "+ttp.getSurfaceArea()+"\n"+
						"                       Volume = "+ttp.getVolume()+"\n"
						+"___________________________________",
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);

				break;
			}
			case 6:
			{
				Cube tc = (Cube) o;
				JOptionPane.showMessageDialog(null,
						"                   Cube Properties"+"\n"+
						"___________________________________"+"\n"+
						"      TopLeft Corner = ( "+tc.getxTopLeft()+","+tc.getyTopLeft()+")"+"\n"+
						"                        Side = "+tc.getSide()+"\n"+
						"                   Surface = "+tc.getSurface()+"\n"+
						"                    Volume = "+tc.getVolume()+"\n"+
						"___________________________________"
						,
						"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE
						);
				break;
			}
		}
	}
}
