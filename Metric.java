/**
Miles to Km or Km to Mile


*/
import java.awt.*;
import javax.swing.JOptionPane;

public class Metric{
	private static double miles, kms;
	String inp;
 	
	
	public static void main(String[] args ){

		inp = JOptionPane.showInputDialog("Enter distance in miles.");
		miles = Double.parseDouble(inp);
		kms = Metric.milesToKm(miles);
		JOptionPane.showMessageDialog(null, "You converted " + inp + " miles to " + kms + " kms.");
		
		switch (choice){
			case 1: Metric.milesToKm(value);
				System.out.Print(value);
	}
	
	public static boolean double getSpeedType(bool km, double distance) {
		if (km==true){ 
			kmTomiles(distance);
			return(x);
		} else 
			milesToKm(distance);
			return(x);
		}
	}
	
	public static double milesToKm (double x) {
		return (x * 1.609);
	}

	public static double kmToMiles() {
		return (x * 0.6);

	}
	
	
}