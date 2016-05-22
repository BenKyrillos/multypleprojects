package multypleprojects;

import javax.swing.JOptionPane;



import java.net.URI;

public class crazycatlady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String y = JOptionPane.showInputDialog(null,"how many cats do you have?");
		// 2. Convert their answer into an int
		int l = Integer.parseInt(y);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (l > 3)
			System.out.println("you're a crazy cat lady");
		else if (l <= 3)
			playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
		else
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		// 4. If they have 3 or less, call the method below to show them a cat video

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

