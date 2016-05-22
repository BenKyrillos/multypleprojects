package multypleprojects;

import javax.swing.JOptionPane;

public class age {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog(null,"how old are you?");
		int c = Integer.parseInt(x);
		if (c > 65)
			System.out.println("you are almost ready to die");
		else if (c < 18)
			System.out.println("You need a nanny");
		else
			System.out.println("You are middle aged");
		
	}

}
