package multypleprojects; 

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String WD = JOptionPane.showInputDialog(null,"Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if (WD.equalsIgnoreCase("yes"))
	System.out.println("You will rule the world");
		// 3. Otherwise, wish them good luck washing dishes.
else
	System.out.println("Good luck washing dishes.");
	}
}

