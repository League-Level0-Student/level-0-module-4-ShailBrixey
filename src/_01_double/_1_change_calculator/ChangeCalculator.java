package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelsInput = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int nickels = Integer.parseInt(nickelsInput);
		// Ask the user how many dimes they have, and convert their answer
		String dimesInput = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(dimesInput);
		// Ask the user how many quarters they have, and convert their answer
		String quartersInput = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(quartersInput);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double nicklesCost = (nickels*0.05);
		double dimesCost = (dimes*0.10);
		double quartersCost = (quarters*0.25);
		double totalCost = nicklesCost+dimesCost+quartersCost;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "You have $"+String.format("%.2f", totalCost));
	}
}

