package ch01.listings;

import javax.swing.JOptionPane;

public class NamePrompter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + name);
	}

}
