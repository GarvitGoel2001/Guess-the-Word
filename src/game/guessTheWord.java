package game;

import java.util.Scanner;

public class guessTheWord {
	private boolean play = true;
	private words randomWord = new words();
	private Scanner sc = new Scanner(System.in);
	private int rounds = 10;
	private char lastRound;

	public void start() {

		do {
			shhowWord();
			getInput();
			checkInput();
		} while (play);

	}

	void checkInput() {
		boolean isGuessedRight = randomWord.guess(lastRound);
		if (isGuessedRight) {
			if (randomWord.isGuessedRight()) {
				System.out.println("Congrats!You Won");
				System.out.println("The word is:" + randomWord);
				play = false;
			}
		}
		else 
		{
			rounds--;
			
			if(rounds==0)
			{
				System.out.println("Game Over!");
				System.out.println("The Word is :"+randomWord);
				play=false;
			}
		}

	}

	void getInput() {

		System.out.println("Enter the letter to guess the  word :");
		String userGuess = sc.nextLine();
		lastRound = userGuess.charAt(0);

	}

	void shhowWord() {
		
		System.out.println("You have "+rounds+" tries left");
		
		System.out.println(randomWord);

	}

	public void end() {
		sc.close();

	}

}
