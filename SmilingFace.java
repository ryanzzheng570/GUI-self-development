import javax.swing.*;
import java.awt.*;
public class SmilingFace
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("Smiling Face");
    frame.setSize(350,320);
    frame.setLocationRelativeTo(null);
    
    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(1,0,0,0));
    frame.setContentPane(pane);
    
    Canvas canvas = new Canvas();
    pane.add(canvas);
    
    frame.setVisible(true);//
    frame.toFront();
  }
}

class Canvas extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    setBackground(Color.yellow);
    
    g.setColor(Color.black);
    int xP[] ={84,104,122,158,189,220,179,170,149,126,115,120,130,134,84}; 
    int yP[] ={217,90,67,59,77,185,218,98,80,82,98,147,158,181,217};
    g.drawPolygon(xP, yP, xP.length);
    g.fillPolygon(xP, yP, xP.length);
    
    g.setColor(Color.white);
    int xP1[] = {130,120,115,126,149,170,173,149,130};
    int yP1[] = {158,147,98,82,80,98,146,161,158};
    g.drawPolygon(xP1, yP1, xP1.length);
    g.fillPolygon(xP1, yP1, xP1.length);
    
    g.drawArc(125,113,48,49,180,360);
    g.fillArc(125,113,48,49,180,360);
    
    g.setColor(Color.black);
    
    g.drawLine(121,107,130,103);
    g.drawLine(130,103,134,107);
    g.drawLine(134,107,132,132);
    g.drawLine(132,132,135,139);
    g.drawLine(135,139,144,137);
    g.drawLine(127,144,136,145);
    g.drawLine(136,145,151,143);
    
    g.drawArc(145,103,15,7,0,155);
    g.drawOval(149,109,10,1);
    g.fillOval(149,109,10,1);
    g.drawOval(122,110,10,1);
  }
}