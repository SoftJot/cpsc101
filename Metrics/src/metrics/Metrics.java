/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metrics;

import javax.swing.JOptionPane;

/**
 *
 * @author chrisbotha
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
    kms = (double) Metric.milesToKm(miles);
    
    JOptionPane.showMessageDialog(null, "You converted " + inp + " miles to " 
            + kms + " kms.");
    
    }
}
    
