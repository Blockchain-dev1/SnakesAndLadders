package SnakesAndLadders;

import java.util.ArrayList;

public class Player {

private  String name;
public int postion = 1;
//The public keyword is an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class
static int cookie = 0;
static int stick = 0;
static boolean done = false;

	
	//Initialise the fields
	public Player(String name){
		//
		//this.name = name;
		this.name = name;
	}
	/**
	 * This method plays out the player's turn.
	 * @return The number of spaces to move on the board.
	 */
	public int takeTurn(){
		
		int diceResult = Dice.getDice();
		//is calling the dice class get dice method to return 
		System.out.println (name +"Dice = " + diceResult );
		
		return diceResult;
		
		
	}

	public String toString(){
		return name;
	}


	
}
