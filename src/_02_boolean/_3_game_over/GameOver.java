package _02_boolean._3_game_over;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		
		while(!gameOver) {
		// 1. Ask the user if the game is over and save their answer.
		String gameOverAns = JOptionPane.showInputDialog(null, "Is the game over?");
		// 2. If they answer "yes" change gameOver to true.
		if(gameOverAns.equals("yes")) {
			gameOver = true;
		}
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		
		// 4. Tell the user the game is over outside the while loop.
		}
		if(gameOver == true) {
		JOptionPane.showMessageDialog(null, "GAME OVER...");
		}
	}

}