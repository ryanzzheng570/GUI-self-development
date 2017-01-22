/* Student Name: Zihao Zheng
 * Program: Create a GUI application InvestmentValueCalculator that calculates the future value of 
 *          an investment at a given interest rate for a specific number of years.
 */
import javax.swing.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
public class InvestmentValueCalculator implements ActionListener
{  
    // Create Labels, TextFields, DecimalFormat, ComboBox //
    private static JLabel initialAmount = new JLabel("Initial Investment Value($):",JLabel.CENTER);
    private static JTextField amount = new JTextField(15);
    private static JLabel rate = new JLabel("Annual interest rate(%):",JLabel.CENTER);
    private static JTextField aRate = new JTextField(15);
    private static JLabel year = new JLabel("Number of years:",JLabel.CENTER);
    private static JTextField inputYear = new JTextField(5);
    private static JLabel finalAmount;
        
    public static DecimalFormat df = new DecimalFormat("#.##");
    
    public static JLabel select = new JLabel("Choose the way to compound: ");
    public static String[] type = {"--Select--","Annually", "Semi-annually", "Monthly", "Bi-Weekly","Weekly"};
    public static JComboBox compoundChoice = new JComboBox(type);
    // Create Labels, TextFields, DecimalFormat, ComboBox //
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Investment Calculator"); 
        frame.setSize(381,202);
        frame.setLocationRelativeTo(null);
        
        JPanel pane = new JPanel();
        pane.setLayout(new GridLayout(5,2,15,5));
        frame.setContentPane(pane);        
        
        finalAmount = new JLabel(""); //Set final amount to nothing first        
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(new InvestmentValueCalculator());
        
        // Add stuff to panel //
        pane.add(initialAmount);
        pane.add(amount);
        pane.add(rate);
        pane.add(aRate);
        pane.add(year);
        pane.add(inputYear);
        pane.add(select);
        pane.add(compoundChoice);
        pane.add(calculate);
        pane.add(finalAmount);
        // Add stuff to panel //
        
        frame.setVisible(true);
        frame.toFront();
    }
    
    public void actionPerformed(ActionEvent event)
    {
        int index = compoundChoice.getSelectedIndex(); //Get the correspone index from the Array
        
        // Get information from the text field //
        String a = amount.getText(); 
        String r = aRate.getText();        
        String y = inputYear.getText();
        // Get information from the text field //
        
        // Turn the text field strings into number //
        double inAmount = Double.parseDouble(a);
        double inRate = Double.parseDouble(r);
        int inYear = Integer.parseInt(y);
        double finAmount;
        // Turn the text field strings into number //
        
        if(index == 0) //Tell user to select compound method if they forget
        {
            finalAmount.setText("Please select how to compound");
        }
        else if(index == 1) //Annual compound
        {
            inRate = inRate/100;
            finAmount = inAmount * Math.pow((1.0+inRate),inYear);
            String output = String.format(df.format(finAmount));
            finalAmount.setText("Amount = " + output);
        }
        else if(index == 2) //Semi-Annual compound
        {
            inRate = (inRate/100)/2; //1 year = 2 half-year
            finAmount = inAmount * Math.pow((1.0+inRate),inYear*2);
            String output = String.format(df.format(finAmount));
            finalAmount.setText("Amount = " + output);
        }
        else if(index == 3) //Monthly compound
        {
            inRate = (inRate/100)/12; //1 year = 12 months
            finAmount = inAmount * Math.pow((1.0+inRate),inYear*12);
            String output = String.format(df.format(finAmount));
            finalAmount.setText("Amount = " + output);
        }
        else if(index == 4) //Bi-Weekly compound
        {
            inRate = (inRate/100)/26; //1 year = 26 bi-weeks
            finAmount = inAmount * Math.pow((1.0+inRate),inYear*26);
            String output = String.format(df.format(finAmount));
            finalAmount.setText("Amount = " + output);
        }
        else if(index == 5) //Weekly compound
        {
            inRate = (inRate/100)/52; //1 year = 52 weeks
            finAmount = inAmount * Math.pow((1.0+inRate),inYear*52);
            String output = String.format(df.format(finAmount));
            finalAmount.setText("Amount = $" + output);
        }
    }
}