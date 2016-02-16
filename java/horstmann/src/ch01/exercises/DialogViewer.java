package ch01.exercises;

import javax.swing.JOptionPane;

public class DialogViewer {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		String action = JOptionPane.showInputDialog(null, "My name is Hal! What would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");
		
	}

}
