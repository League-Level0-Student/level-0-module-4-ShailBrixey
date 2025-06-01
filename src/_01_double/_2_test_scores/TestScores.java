package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String testScoreInput = JOptionPane.showInputDialog("What did you get on the test?");
		double testScore = Double.parseDouble(testScoreInput);
		
		if(testScore >= 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
		if(testScore >= 80 && testScore < 90) {
			JOptionPane.showMessageDialog(null, "Good job studying.");
		}
		if(testScore >= 70 && testScore < 80) {
			JOptionPane.showMessageDialog(null, "Could have done better.");
		}
		if(testScore >= 60 && testScore < 70) {
			JOptionPane.showMessageDialog(null, "Not your best job.");
		}
		if(testScore < 60) {
			JOptionPane.showMessageDialog(null, "That was terrible!");
		}
	}

}
