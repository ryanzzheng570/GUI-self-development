import javax.swing.*; 
import java.awt.*; 
public class DrawGraph 
{ 
  public static void main(String[] args) 
  { 
    //Construct JFame object as a container for other objects 
    JFrame frame = new JFrame("Quadratic Function"); 
    frame.setSize(500,500); //Set the dimensions of the window 
    frame.setLocationRelativeTo(null);//center the frame 
    JPanel pane = new JPanel();  //and add content pane to a frame 
    pane.setLayout(new GridLayout(1, 0, 0, 0));
    frame.setContentPane(pane); 
    
    DrawCanvas canvas = new DrawCanvas(); 
    pane.add(canvas); 
    
    //Display the frame - window 
    frame.setVisible(true); 
    //Bring the window to front 
    frame.toFront(); 
  } 
} 

class DrawCanvas extends JPanel 
{ 
  public void paintComponent(Graphics g) 
  { 
    super.paintComponent(g); //this line is necessary to make GUI components drawn 
    //set color and draw rectangle 
    g.setColor(Color.black); 
    int width = 400, height = 400; 
    g.drawRect(80,0, width, height); 
    g.drawString("y",20,200); 
    g.drawString("x",280,420); 
    
    int xOrigin = 280; 
    int yOrigin = 400; 
    g.drawLine(xOrigin, yOrigin, xOrigin, yOrigin - height); 
    int[] xPoints = new int [20]; 
    int[] yPoints = new int [20]; 
    int[] SecondxPoints = new int [20]; 
    for (int i = 0; i < xPoints.length; i ++) 
    { 
      xPoints[i] = xOrigin + 10 * i; 
      yPoints[i] = yOrigin - 20 * i * i; 
      SecondxPoints[i] = ((xPoints[i] - xOrigin) * -1) + xOrigin; 
      g.drawLine(xOrigin + 10 * i, yOrigin, xOrigin + 10 * i, yOrigin - height); 
      g.drawLine(xOrigin - 10 * i, yOrigin, xOrigin - 10 * i, yOrigin - height); 
      g.drawLine(xOrigin - width/2, yOrigin - 20 * i, xOrigin + width/2, yOrigin - 20 * i); 
    } 
    
    g.drawPolyline(xPoints, yPoints, 20);//drawPolyLine(int[] xPoints, int[] yPoints, int nPoints) 
    g.drawPolyline(SecondxPoints, yPoints, 20);//Draws the second part of the quadratic 
  } 
}