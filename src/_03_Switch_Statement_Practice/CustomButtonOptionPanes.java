package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Chick-fil-A is closed");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Who chooses Monday?!?");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Chick-fil-A is open");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "HUMP DAY");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Friday Eve");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "It's Friday, Friday\n" + 
					"Gotta get down on Friday\n" + 
					"Everybody's lookin' forward to the weekend, weekend\n" + 
					"Friday, Friday\n" + 
					"Gettin' down on Friday\n" + 
					"Everybody's lookin' forward to the weekend\n" + 
					"Partyin', partyin' (Yeah)\n" + 
					"Partyin', partyin' (Yeah)");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Best day of the week?!");
		}
	}
}
