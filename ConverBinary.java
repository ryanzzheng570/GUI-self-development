/* Student Name: Zihao Zheng
 * Program: Create a GUI application that allows the user to convert a number from decimal to binary, 
 *          from binary to decimal, decimal to hexadeciamal, and from hexadeciamal to decimal. 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ConverBinary implements ActionListener
{
    // Create Labels, Groups, Buttons,TextField //
    private static JLabel output = new JLabel("");
    private static JLabel askInput = new JLabel("Enter the Binary/(Hexa)Decimal");
    private static JButton convert;    
    private static JTextField input = new JTextField(10);
    
    private static ButtonGroup radioG = new ButtonGroup();
    private static JRadioButton gDeToBin = new JRadioButton("Decimal to Binary",true);
    private static JRadioButton gBinToDe = new JRadioButton("Binary to Decimal",true);
    private static JRadioButton gDeToHexaDe = new JRadioButton("Decimal to Hexadeciamal",true);
    private static JRadioButton gHexaDeToDe = new JRadioButton("Hexadeciamal to Decimal",true);
    // Create Labels, Groups, Buttons,TextField //
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Conversion");
        frame.setSize(607,176);
        frame.setLocationRelativeTo(null);
        
        JPanel pane = new JPanel();
        pane.setLayout(new GridLayout(4,1,25,1));
        frame.setContentPane(pane);
        
        JLabel intro = new JLabel("Select to convert"); // Create Labels
        JLabel space = new JLabel("                       "); //Create a empty space
        JLabel space1 = new JLabel("                       "); //Create a empty space
        
        radioG.add(gDeToBin); //Add radio button to the group
        radioG.add(gBinToDe);
        radioG.add(gDeToHexaDe);
        radioG.add(gHexaDeToDe);
        
        convert = new JButton("Convert");
        //Add to ActionListener //
        convert.addActionListener( new ConverBinary());        
        gDeToBin.addActionListener( new ConverBinary());
        gBinToDe.addActionListener( new ConverBinary());
        gDeToHexaDe.addActionListener( new ConverBinary());
        gHexaDeToDe.addActionListener( new ConverBinary());
        //Add to ActionListener //
        
        //Add component into panel //
        pane.add(askInput);
        pane.add(input);
        pane.add(space);
        
        pane.add(intro);
        pane.add(gDeToBin);
        pane.add(gBinToDe);
        
        pane.add(space1);
        pane.add(gDeToHexaDe);
        pane.add(gHexaDeToDe);
              
        pane.add(convert);
        pane.add(output);
        //Add component into panel //
        
        frame.setVisible(true);
        frame.toFront();
    }
    
    public void actionPerformed(ActionEvent event)
    {
        if (event.getActionCommand().equals("Convert"))
        {
            if(gDeToBin.isSelected()) //Situation when Decimal To Binary button selected
            {
                String decimalStringNum = input.getText();
                int decimalNum = Integer.parseInt(decimalStringNum);
                String binaryNum = Integer.toBinaryString(decimalNum);
                output.setText(decimalStringNum + " Decimal = " + binaryNum + " binary");
            }
            else if(gBinToDe.isSelected()) //Situation when Binary to Decimal button selected
            {
                String binaryNum = input.getText();
                int decimalNum = Integer.parseInt(binaryNum,2);
                String decimalStringNum = Integer.toString(decimalNum);                
                output.setText(binaryNum + " Binary  = " + decimalStringNum + " decimal");
            }
            else if(gDeToHexaDe.isSelected()) //Situation when Decimal To HexaDecimal selected
            {
                String decimalStringNum = input.getText();
                int decimalNum = Integer.parseInt(decimalStringNum);
                String hexNum = Integer.toHexString(decimalNum);
                hexNum = hexNum.toUpperCase();
                output.setText(decimalStringNum + " Decimal = " + hexNum + " hexadecimal");
            }
            else if(gHexaDeToDe.isSelected()) //Situation when HexaDecimal To Decimal selected
            {
                String hexStringNum = input.getText();               
                int decimalNum = Integer.parseInt(hexStringNum,16);
                String decimalStringNum = Integer.toString(decimalNum);
                output.setText(hexStringNum + " hexadecimal = " + decimalStringNum + " decimal");
            }
        }
    }
}
        