
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class GUIAssignment1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Unit 3 Assignment 1"); //Declare a frame
        frame.setSize(300, 250); //Set the size
        frame.setLocationRelativeTo(null); //Move it into the centre
        
        JPanel pane = new JPanel(); //Create a content panel
        pane.setLayout( new FlowLayout(FlowLayout.LEFT,10,30)); //Aligned left with horizontal gap 10 and vertical gap 30
        frame.setContentPane(pane); //Add the content pane to the frame
        
        Font font = new Font("TimesRoman", Font.BOLD,20); //Set the font
        Border lineBorder = new LineBorder(Color.yellow, 2); //Declare the lineBorder 
        
        JLabel L1 = new JLabel("Black"); //L1 = Label1 etc.
        JLabel L2 = new JLabel("Blue");
        JLabel L3 = new JLabel("Cyan");
        JLabel L4 = new JLabel("Green");
        JLabel L5 = new JLabel("Magenta");
        JLabel L6 = new JLabel("Orange");
        
        L1.setFont(font); //Set to the specified font from L1 to L6
        L2.setFont(font);
        L3.setFont(font);
        L4.setFont(font);
        L5.setFont(font);
        L6.setFont(font);
        
        L1.setForeground(Color.black); //Set the fore color
        L2.setForeground(Color.blue);
        L3.setForeground(Color.cyan);
        L4.setForeground(Color.green);
        L5.setForeground(Color.magenta);
        L6.setForeground(Color.orange);
        
        L1.setBackground(Color.white); //Set the background color to white
        L2.setBackground(Color.white);
        L3.setBackground(Color.white);
        L4.setBackground(Color.white);
        L5.setBackground(Color.white);
        L6.setBackground(Color.white);
        
        L1.setBorder(lineBorder); //With yellow border line
        L2.setBorder(lineBorder);
        L3.setBorder(lineBorder);
        L4.setBorder(lineBorder);
        L5.setBorder(lineBorder);
        L6.setBorder(lineBorder);
        
        pane.add(L1); //Add the Labels to the pane.
        pane.add(L2);
        pane.add(L3);
        pane.add(L4);
        pane.add(L5);
        pane.add(L6);
        
        frame.setVisible(true); //Set it to visible
        frame.toFront(); //Set it to the very front
    }
}
        