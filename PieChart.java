import javax.swing.*;
import java.awt.*;
public class PieChart
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Pie Percentage Chart");
    frame.setSize(500,500);
    frame.setLocationRelativeTo(null);
    
    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(1,0,0,0));
    frame.setContentPane(pane);
    
    Canvas2 canvas = new Canvas2();
    pane.add(canvas);
    
    frame.setVisible(true);
    frame.toFront();
  }
}

class Canvas2 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);       
    
    g.setColor(Color.yellow);
    g.fillArc(45,35,402,400,360,45);
    
    g.setColor(Color.blue);
    g.fillArc(45,35,400,400,405,260);
    g.drawString("30% Exams",35,400);
    
    g.setColor(Color.red);
    g.fillArc(45,35,402,400,180,108);
    g.drawString("40% Projects",35,75);
    
    g.setColor(Color.green);
    g.fillArc(45,35,402,400,288,72);
    
    g.setColor(Color.magenta);
    g.drawString("20% Final Projects",375,410);
    
    g.setColor(Color.black);
    g.drawString("10% Quizzes",400,100);
  }
}