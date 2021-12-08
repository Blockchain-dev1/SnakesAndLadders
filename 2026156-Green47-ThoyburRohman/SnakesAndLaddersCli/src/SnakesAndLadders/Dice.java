package SnakesAndLadders;

public class Dice {

	public static int getDice () 
	{

		int Dice = (int)(Math.random()*6 )+1 ; //creates dice roll number 1
		//math . random is generating a number between 0-5 and we plus 1 so we can a 6 sided dice  
		return Dice;		 
	}
	
}