import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String shiv = JOptionPane.showInputDialog("What is your birthday");
		if ("3/21/07".equals(shiv)) {
			JOptionPane.showMessageDialog(null, ("Happy birthday!"));
		} else JOptionPane.showMessageDialog(null, ("Happy unbirthday!"));

		}

	}


