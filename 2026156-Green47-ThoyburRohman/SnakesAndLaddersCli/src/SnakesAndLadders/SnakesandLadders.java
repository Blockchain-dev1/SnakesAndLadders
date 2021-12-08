package SnakesAndLadders;

import java.util.ArrayList;

import java.util.Scanner;

public class SnakesandLadders {
	
//	private static final ArrayList<Player> players = new ArrayList<>();
//	private static final int playerIdx = 0;
//	private static final int roll = 0;;
//	static String game3 ;
//	static Boolean game;
//	static int numplayers = 2 ;
//	static {
//		players.add(new Player("Test roll "));
//		pre processor ,
//	}

	public static void main (String[] arg) {
		gamestart(); 
		
	}

	private static void gamestart() {
		// TODO Auto-generated method stub
		String title=
				"     _______..__   __.     __        __  ___    _______                __            __       _______   _______  _______ .______           _______. \n"+
				"    /       || \\ |  |     /  \\      |  |/  /   |   ____|     ___      |  |          /  \\     |       \\ |       \\|   ____||    ' \\         /       |  \n"+
				"   |   (----`|  \\|  |    /  ^ \\     |  '  /    |  |__       ('' )     |  |         /  ^ \\    |  .--.  ||  .--. ||  |__   |  |-)  |       |   (----`  \n"+
				"    \\   \\    |  \\   |   /  /'\\ \\    | <  |     |   __|      /   \\     |  |        /  /'\\ \\   | |   |  ||  |  | ||   __|  |      /        \\   \\      \n"+
				".----)   |   |  |\\  |  /  _____ \\   |  .  \\    |  |____    | ('> /    |   `----  /  _____ \\  |  '--'  ||  '--' ||  |____ |  |\\ \\---.   ---)   |     \n"+
				"|_______/    |__| \\_| /__/    \\__\\  |__|\\__\\   |_______|   |____/     |_______| /__/    \\__\\ |_______/ |_______/|_______||'_| `.____| |_______/      \n"+                                                                                                                  
				"                                                                                                                                                                  ";
	System.out.println(title);
	
		System.err.println(
				"Instructions:\r\n"
				+ "-  1-3 users are needed to play this game \r\n"
				+ "- Each player is assigned a colour and a name\r\n"
				+ "- The board consists of 100 squares ranging from 1-100.Start on square on one. First player to reach square 100 wins.\r\n"
				+ "- Each player roles the dice, the value shown on the dice dictates the number of squares each player moves.\r\n"
				+ "- Game is only won if square 100 is landed on exactly e.g. if a player is on 97 and roll a 4 they will not be allowed \r\n "
				+ " to move forward, they should continue to retry until 3 is rolled\r\n"
				+ "- Landing on a head of snake will require the player to move down to the end of the snake.\r\n"
				+ "- landing on the bottom of a ladder allows the player to travel up to the top of the ladder\r\n"
				+ "- landing on a cookie allows the player from not having to travel down the snake if encountered. \r\n"
				+ "");

		System.out.println("SnakesAndLadder");
		System.out.println("Created by Thoybur Rohman ");
		// here is the welcome screen the user will see 
		boolean game = false;
		Scanner scan = new Scanner (System.in);
		// Becuase the game is false we will go into the if loop 
		if (game == false) {
			System.out.print("Would you like to play a game? Y for yes , or anything else for no");
			// using the scanner to ask if they want to start the game 
			String game2 = scan.nextLine(); 
			//
			//game3 = game2.toUpperCase();			
			//game = Junit1( game3);
						if(game2.equals ("y") || game2.equals ("Y")){
			//this is comparing if the input is the same as Y
							game = true;
							//chages game to = true
			
						}
						else {
						System.out.println("see you next time");
							game = false ;
							// this will auto end the gamne 
						}


			while ( game == true ){

				int numplayers = 0;
								//testingZ();
								try {
				
									Scanner scan1 = new Scanner( System.in);
									System.err.println("How many player would like to play with between 1 - 3");
									numplayers = scan1.nextInt();
				
								}
								catch(Exception e) {
								//will catch any input which is not accepted 
								}
				// put a try and catch 
				//exception 

				if (numplayers >= 1 && numplayers <4) {
					ArrayList<Player> players = new ArrayList<Player>();
				//Lab sheet 5 is creatimg an array lis of player in the class player
					for (int index = 0; index < numplayers; index++){
						//index++;
						Player PlayerOfTheGmae = new Player("P" + index + " " );
						//thia is adding it to the players and giving it an index 
						players.add(PlayerOfTheGmae);
						 
						System.out.println(PlayerOfTheGmae.toString());
						//theh the name is comverted to string 
				
					}
//					if(true) {
//						return;
//					}

					Board board = new Board();
					//we do this so we can call the board class
					//Loop until a player reaches the final spot.
					//Players take turns to roll the die and move on the board


					boolean done = false;


					while (numplayers > 1 && numplayers <4)
						//will not enter unless while requiement is met
						while (!done) {
							for(int playerIdx = 0 ;playerIdx < numplayers;playerIdx++)
							//This is the index which is giving each p
								{
								Scanner scan11 = new Scanner( System.in);
								if (numplayers !=100)
									//it will only go inti the if loop if the player is less than 100
									System.err.println("Player " + playerIdx + " are you ready? press y when you are below ");
								String ready1 = scan11.nextLine();
								if(ready1.equalsIgnoreCase ("y") )
									//ignores capital or not
								{

									Player currPlayer = players.get(playerIdx);
									// currPlayer is equal to the player index using the  player class
									int roll = currPlayer.takeTurn();

									done = board.movePlayer(currPlayer, roll );
									// is sent to the board . move player method
									if ( roll == 6 ) {

										roll = currPlayer.takeTurn();
										done = board.movePlayer(currPlayer, roll );
									}
									//this method prints the board
									System.out.println(board.toString());
									//returns the final position
									System.out.println("your position is " + currPlayer.postion);
									System.out.println("-----------------------\n");

									ArrayList<Integer> finished = new ArrayList<Integer>();

									while (done == true) {								
										
										finished.add(playerIdx);
										if (finished.size() == playerIdx ) 
											
										{
										    System.out.println(finished + " is the winner ");
												
												break;
												//Integration.Menu()
										}
										
									}

								}
							}							
						}
				}
			}
		}
	}
}
//
//	public static Boolean Junit1(String game3) {
//		if( game3.equals ("t")){
//
//			game = true;
//
//		}
//		else {
//			System.out.println("This is not an input");
//			game = false ;
//			// this will auto end the gamne 
//		}
//		return game;
//	}
//	public static int testingZ() {
//		try {
//
//			Scanner scan1 = new Scanner( System.in);
//
//			System.err.println("How many player would like to play with 1 - 3");
//			numplayers = scan1.nextInt();
//			System.err.println(numplayers);
//			return numplayers;
//		}
//		catch(Exception e) {
//
//		}		return numplayers;
//	}
//
//	public static int testingDice() {
//
//		System.err.println("Player " + playerIdx + " are you ready? press y when you are below ");
//		Scanner scan11 = new Scanner(System.in);
//		String ready1 = scan11.nextLine();
//		Player currPlayer = players.get(playerIdx);
//		if(ready1.equals ("y") || ready1.equals ("Y")) {
//			try {
//				int roll = 0;
//				roll = Player.takeTurn();
//				return roll;
//				}
//			
//			catch(Exception e) {
//				System.err.println("NO");
//			}	
//		
//
//
//	}
//		return (Integer) null;
//}
//}









		
	




