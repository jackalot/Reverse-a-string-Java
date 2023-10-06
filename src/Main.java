import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a word to reverse, I swear its magical!");
		String newString = "";
		for (int i = input.length() - 1; i > -1; i--) {
			newString += input.charAt(i);
		}
		JOptionPane.showMessageDialog(null, "Your magical new message is: \n" + newString);
	}
}
