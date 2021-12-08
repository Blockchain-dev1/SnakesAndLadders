package SnakesAndLadders;

public class Board {

	//Constant values: Board size, and number of snakes and ladders
	private final int ROWS = 10;
	private final int COLS = 10;
	private final int NUM_SNAKES = 4;
	private final int NUM_LADDERS = 4;

	//Board variables
	private int[][] gameBoard;
	private int[][] snakes;
	private int[][] ladders;
	private int[] cookie1;
	private int[] stick;
	//The private keyword is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
	//int counter = 1;

	public  Board(){
		makeBoard ();
		setSnakes();
		setLadders();
		getCookies();
		getSticks();		
	}

	private void makeBoard() {
		gameBoard = new int [ROWS][COLS];
		for (int row = 0; row < ROWS; row++){
			for (int col = 0; col < COLS; col++){
				 gameBoard[row][col] = row*10 + col+1;
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		//Array gamePrint[][] =  gameBoard;
		for (int row = 0; row < ROWS; row++){
			for (int col = 0; col < COLS; col++) {
				sb.append("\t");
				sb.append(gameBoard[row][col]);
				//sb.append("\n");
			}
			sb.append("\n");			
		}
		 return sb.toString();
	}
	private void getSticks() {
		// TODO Auto-generated method stub
		stick = new int [2];

		stick [0]= 32;
		stick [1]= 56;
	}

	private void getCookies() {
		// TODO Auto-generated method stub

		cookie1 = new int [2];

		cookie1 [0]= 17;
		cookie1 [1]= 55;

	}

	private void setLadders() {
		// TODO Auto-generated method stub
		ladders = new int[NUM_LADDERS][2];

		ladders[0][0] = 4;
		ladders[0][1] = 14;

		ladders[1][0] = 25;
		ladders[1][1] = 31;

		ladders[2][0] = 42;
		ladders[2][1] = 55;

		ladders[3][0] = 63;
		ladders[3][1] = 78;
	}
	
	private void setSnakes() {
		// TODO Auto-generated method stub
		snakes = new int[NUM_SNAKES][2];

		snakes[0][0] = 20;
		snakes[0][1] = 7;

		snakes[1][0] = 54;
		snakes[1][1] = 19;

		snakes[2][0] = 44;
		snakes[2][1] = 32;

		snakes[3][0] = 88;
		snakes[3][1] = 75;

	}
	public boolean movePlayer(Player currPlayer, int roll )
	//we put CurrPlyyer and roll because they are the varible being pushed into the method 
	{

		//Compute the new position

		currPlayer.postion = currPlayer.postion + roll;
		//position is updated aftter the roll is added to it 
		if (currPlayer.postion == 100){
			//If the new position is 100 (or above), the player wins!
			return true;
		}	
		//checked if if the position
		if ((currPlayer.postion == cookie1 [0])||(currPlayer.postion ==cookie1 [1]))
		{
			Player.cookie ++;
			//cookie will be incremented
			System.out.println("You got a cookie");
			System.out.println(Player.cookie);
			//returns the ammount oif cookies that player has 
			//player cookie is updated
		
		}
		if ((currPlayer.postion == stick [0])||(currPlayer.postion ==stick [1]))
		{
			Player.stick ++;
			//increments stick by 1
			System.out.println("You got a stick");
			System.out.println(Player.stick);
			
		}

		// add a minus cookie 
		else  {
			for(int idx = 0; idx < NUM_SNAKES; idx++){
				if (snakes[idx][0] == currPlayer.postion){
					//If the new position is the starting point for a snake
					if(Player.cookie>0) {
						//cookie is being checked
						currPlayer.postion = currPlayer.postion;
						//nothing chnages 
						Player.cookie --;
						return false;
						// will return false reason being player index is not equal to snakes 
					}

					else { //Move the player to the end position for the snake 
						currPlayer.postion = snakes[idx][1];
						//updates the player position
						System.out.println(currPlayer.postion + "Landed on a snake " + snakes[idx][0] + " to " + snakes[idx][1]);

						return false;
					}
				}
			}

			for (int idx1 = 0; idx1 < NUM_LADDERS;idx1++){
				if (ladders[idx1][0] == currPlayer.postion){
					//If the new position is the starting point for a snake
					if(Player.stick >0) {
						currPlayer.postion = ladders[idx1][1] +10;
						Player.stick --;
						System.out.println("Landed on a ladder " + ladders[idx1][0] + " to " + ladders[idx1][1] + "another 10 spaces bacuse you have a stick" );
						return false;
					}
					else  {
						
						currPlayer.postion = ladders[idx1][1];
						System.out.println("Landed on a ladder " + ladders[idx1][0] + " to " + ladders[idx1][1]);
						//moves the player frrom the idx
						return false;
					}
				}

				else if (currPlayer.postion > 100) {
					//If the new position is more than 100
					currPlayer.postion = currPlayer.postion - roll;
					System.out.println("You rolled " + roll +" which is over 100");
					return false;
				}
			}		
		}
		return false;
	}
}
