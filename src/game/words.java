package game;

import java.util.Random;

public class words {

	private String[] randomWords= {"animals","happiness","indefinite","steady","birthday","extreme","rights","properties","ceremony","independence","beneath","information","students","extraction","impatient","Sarcasm"};

	private String selectedWord;
	
	private char[] letters;
	
	private Random random=new Random();
	
	public words() {
		selectedWord=randomWords[random.nextInt(randomWords.length)];
		letters= new char[selectedWord.length()];
	}
	
public String toString()
{
	StringBuilder text= new StringBuilder();
	
	
	for(char letter : letters)
	{
		
//	if(letter=='\u0000')
//	// \u0000 denotes the null in java 
//	{
//		text.append('-');
//		
//	}
//	else  {
//		text.append(letter);
//		
//	}instead of using if-else use ternary operator 
		
		
	text.append(letter=='\u0000'?'-':letter);
	text.append(' ');
	}
	
	return text.toString();
	// we are using string builder instead of string to make the code more efficient
}

public boolean guess(char letter) {
	
	boolean guessedRight=false;
	for(int i=0;i<selectedWord.length();i++) {
		
		if(letter==selectedWord.charAt(i)) {
			letters[i]=letter;
			guessedRight=true;
			
		}
	}
	return guessedRight;
	
}

public boolean isGuessedRight() {
	
	for(char letter:letters) {
		if(letter=='\u0000')
		{
			return false;
		
		}
		
	}
	return true;
}

}
