
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog(null, "What is your last name?:");
		String y = JOptionPane.showInputDialog(null, "What is your first name?:");
		String w = JOptionPane.showInputDialog(null, "What is your birthday?:");
		String t = JOptionPane.showInputDialog(null, "What is your gender? :");
		String h = JOptionPane.showInputDialog(null, "Where are you traveling to? :");
		System.out.println(x+"/"+y+" ("+w+", "+t+") Traveling to: "+h);
	}
}
