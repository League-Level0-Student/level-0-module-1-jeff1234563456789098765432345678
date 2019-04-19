import javax.swing.JOptionPane;

public class Secret_Message_Box {
	public static void main(String[] args) {
	String password = "shiv";
	String shiv =JOptionPane.showInputDialog("Give me a message!");
	String shiv1 = JOptionPane.showInputDialog("You can only see the secret message if you guess the password!");
	if ("shiv".equals(shiv1)) {
	JOptionPane.showMessageDialog(null, ("I like tennis"));
	} else JOptionPane.showMessageDialog(null, ("INTRUDER!"));
	}
}


