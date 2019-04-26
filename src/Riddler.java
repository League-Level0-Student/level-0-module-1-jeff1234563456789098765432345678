import javax.swing.JOptionPane;

public class Riddler {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int score = 0;
		String shiv = JOptionPane.showInputDialog("What has many keys, but can't even open a single door?");
		if ("piano".equals(shiv)) {
		
		score++;
		JOptionPane.showMessageDialog(null, ("Correct!" + score));
	} else { JOptionPane.showMessageDialog(null, ("WRONG ANSWER ANSWER IS PIANO!"));
	
	String crab = JOptionPane.showInputDialog("How can you leave a room with two legs and return with six legs?");
	if ("chair".equals(crab)) {
		
		score++;
		JOptionPane.showMessageDialog(null, ("Correct!" + score));
	} else { JOptionPane.showMessageDialog(null, ("WRONG ANSWER ANSWER IS CHAIR!"));
	

	}

}
		
}}