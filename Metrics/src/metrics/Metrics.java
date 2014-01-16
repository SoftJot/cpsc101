/*
Driver Program to access class Metric.java
Testing File edit with CJ having it checked out.
 */

package metrics;

import javax.swing.JOptionPane;

/**
 *
 * @author chrisbotha /// added Cj Edwrds
 */
public class Metrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double miles, kms;
    String inp;
    
    inp = JOptionPane.showInputDialog("Enter distance in miles.");
    miles = Double.parseDouble(inp);
    //Cast to double to eliminate int input runtime error.
    kms = (double) Metric.milesToKm(miles);
    
    JOptionPane.showMessageDialog(null, "You converted " + inp + " miles to " 
            + kms + " kms.");
    
    }
}
    
