# Week6-TIC-TAC-TOE-Lab
This Lab requires you to program a simple game of Tic Tac Toe.

Note:  there are many ways to implement this game.  Use what 
 you have already learned.  You have the tools to implement
 this game. This is my version of the TIC TAC TOE Game.
 
 Rules:  
 - Tic Tac Toe is a 2-player game played on a 3x3 grid.  

- One player usually plays "X"s and the other player plays "O"s.

- In our version of the game, "X"s will always start.

- Players will alternate turns.

- The game will end when one of the conditions is true:
	1. A player gets three squares in a row 
	2. A player gets three squares in a column
	3. A player gets three squares in either diagonal
	4. Every square is filled in, but no player has achieved 
	conditions 1,2, or 3 as described above --> A Draw!
	
	- A player can win on turn 5, 6, 7, 8, or 9 (start checking for winners on or before turn 5)
	
	- Error checking of input is not necessary here, but will make this game much more
	  robust.  If you choose to implement this, get the game working first, and then
	  add a check of the input to make sure that it's an Integer from 1 to 9.
	  
  	- Use the Scanner to input the users choice of square -- one suggestion is  
	  to create numbers within the square, and then have the user choose 
	  that integer (1-9) to choose the location.
	
