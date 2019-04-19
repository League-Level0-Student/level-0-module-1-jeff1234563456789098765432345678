import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;
		String shiv = JOptionPane.showInputDialog("What has many keys, but can't even open a single door?");
		if ("piano".equals(shiv))
			;
		score++;
		JOptionPane.showMessageDialog(null, ("Correct!" + score));
	} else JOptionPane.showMessageDialog(null, ("Wrong correct awnser was Piano"));

	}

}
