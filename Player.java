package week06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Player {
	
	List<Set<Integer>> playerPicks = new ArrayList<Set<Integer>>();
	Set<Integer> playerMoves = new HashSet<Integer>();
	int moves = 0;
	char name;
	
	
	public Player() {
		
	}
	public Player (char name) {
		
		this.name = name;
	}
	
	

	public char getName() {
		
		return name;
	}
	
	public int playerMoves(GameBoard board) {
		
		boolean rightInput = false;
		String readLine = new String();
		char choice = 'i';
		
		//Scanner in = new Scanner(System.in);
		
		int choiceInt = 0;; 
		GameBoard.turns++;
		System.out.println("Turn: " + GameBoard.turns);
		if (GameBoard.turns < 10) {
		
		do {
		    	System.out.println(this.getName() + ": Make your move:");
			
				rightInput = false;
			 
				readLine = (GameBoard.in.nextLine()).trim();
				 
				choice = (readLine.charAt(0));
			 
			 
				choiceInt = Integer.valueOf(choice) - 48;
			 
				System.out.println("You pick: "+ choiceInt);
			 
				if(choiceInt > 0 && choiceInt < 10) {
				
				 switch (choiceInt) {
				 
				 case 1:
					      if(((board.getBoard())[0][0] != 'X' && (board.getBoard())[0][0] != 'O')) {
					    	  
					    	  (board.getBoard())[0][0] = this.getName();
					    	  rightInput = true;
					      } else {
					    	  System.out.println("This position is already taken. Try again");
					    	  
					      }
					 
					 break;
				 case 2:
						 if(((board.getBoard())[0][1] != 'X' && (board.getBoard())[0][1] != 'O')) {
					    	  
					    	  (board.getBoard())[0][1] = this.getName();
					    	  rightInput = true;
					      } else {
					    	  System.out.println("This position is already taken. Try again");
					    	  
					      }
					 
					 break;	 
					 
				 case 3:
					 if(((board.getBoard())[0][2] != 'X' && (board.getBoard())[0][2] != 'O')) {
				    	  
				    	  (board.getBoard())[0][2] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
					 
					 break;
					 
				 case 4:
					 if(((board.getBoard())[1][0] != 'X' && (board.getBoard())[1][0] != 'O')) {
				    	  
				    	  (board.getBoard())[1][0] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
					 
					 break;
				 case 5:
					 if(((board.getBoard())[1][1] != 'X' && (board.getBoard())[1][1] != 'O')) {
				    	  
				    	  (board.getBoard())[1][1] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
					 
					 break;
					 
				 case 6:
					 if(((board.getBoard())[1][2] != 'X' && (board.getBoard())[1][2] != 'O')) {
				    	  
				    	  (board.getBoard())[1][2] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
					 
					 break;
				 case 7:
					 if(((board.getBoard())[2][0] != 'X' && (board.getBoard())[2][0] != 'O')) {
				    	  
				    	  (board.getBoard())[2][0] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }	
					 
					 break;
				 case 8:
					 if(((board.getBoard())[2][1] != 'X' && (board.getBoard())[2][1] != 'O')) {
				    	  
				    	  (board.getBoard())[2][1] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
					 
					 break;
				 
				 case 9:
					 if(((board.getBoard())[2][2] != 'X' && (board.getBoard())[2][2] != 'O')) {
				    	  
				    	  (board.getBoard())[2][2] = this.getName();
				    	  rightInput = true;
				      } else {
				    	  System.out.println("This position is already taken. Try again");
				    	  
				      }
				 }
				 
				
				}	 
				 else {
						 System.out.println("You must pick a number between one and ten. Try again");
						 rightInput = false;
					 }
			 
		
			} while (!rightInput); // END DO...WHILE
		}
		
		playerMoves.add(choiceInt);
		
		if(GameBoard.turns % 3 == 0) {
			fillPicksList();
			
		}
		
	  return choice;
	}//END PlayerMoves
	
	public void fillPicksList() {
		playerPicks.add(playerMoves);
		//playerMoves = new HashSet<Integer>();
				
	}
	
	

}
