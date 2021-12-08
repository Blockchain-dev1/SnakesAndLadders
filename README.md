# Snakes And Ladders

# CS1701 Level 1 Group Project: CS1810 Software Implementation-course-work--java--Specification:

#### This was a simple console command line interface that I worked on using VB.Net during my the start of my University.


## | Assessment Elements	Weighting	Descriptions:                                                                                                                                                                                                                                                                                                                       
#### | 1)-The program should allow the user to play Snakes and Ladders against 1-3 other players.                                             

#### | 2)-The board has 100 squares, starting from 1 and going up to 100. The players start at square 1. The first player
to reach square 100 wins the game. Each player rolls the dice when their turn comes. Based on the dice value,
the players move. The dice has six sides..                                                                                                                                 |

#### | 3)-For example, if a player is on square 10 and they roll 5, they will move to square 15. A player wins if they arrive
at/land on square 100, exactly. That is, if a player is on square 97, and they roll 4, they cannot move. They must
keep playing until they roll exactly 3 Each player should have a colour or a name assigned to them. So, after each turn, the program should display:
[Lela] rolled a [5] and moved from square [10] to [15]. |

#### | 4)-Before the game begins, the program should place a number of snakes and ladders on the board.
Each snake has a head and a tail on the board. If the player lands on a square where a snake’s head is, the player
should move down to the square where the end of the snake’s tail is. Similarly, if the player lands on a square
where the bottom of the ladder is, the player should move up to the square where the top of the ladder is. That
is, the head of a snake is always in a square of a higher number than the square where the end of its tail is, and
the top of a ladder is always in a square of a higher number than the square where its bottom is.
If a player rolls 6, they move the number given (moving down a snake or up a ladder if moving six squares
forward lands on one of them) and then they get an additional turn.
The game continues until all players, but one, reach square 100                    |

#### | 5)-The board also contains two biscuits (one on each of two squares determined by the program before the game
begins). If a player lands on a biscuit square they can keep the biscuit and feed it to the next snake that they
encounter so that they do not have to move down to the tail square. .                                                                                                      |

#### | 6)- veriation B: The board also contains two big sticks. If a player lands on a big stick square, they can keep
the big stick and use it to scare away the next snake that they encounter which will result in the snake
moving 10 squares (one row) up the board. Note: a big stick cannot be used for any snake the head of
which is in the row which includes the ‘Finish’ square (the row of squares from 91 to 100) 

## Screenshots
# Snakes & Ladders menu option :
![image](![image](https://user-images.githubusercontent.com/73062879/145276787-5da151b2-be9b-464f-ab0d-5b8d5aa02f9d.png)



## Requirements 🔧
Java version 8 or higher.
## Installation 🔌
#### 1) Press the Fork button (top right the page) to save copy of this project on your account.

#### 2) Download the repository files (project) from the download section or clone this project by typing in the bash the following command:

#### 3) git clone https://github.com/Blockchain-dev1/SnakesAndLadders.git
Imported it in VS CODE or any other Java IDE.

Run the application :D
