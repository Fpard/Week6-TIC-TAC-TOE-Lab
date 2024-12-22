package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GameBoard {
	
	char[][] board = new char[3][3];
	
	//static Set<Integer> positions = new HashSet<Integer>();
	static  List<Set<Integer>> combinations = new ArrayList<Set<Integer>>();
	static int turns = 0;
	static Scanner in = new Scanner(System.in);
	
	String xBoarder = "+---+---+---+";
	String yBoarder = "|  ";
	
	public GameBoard() {
		
		for (int row = 0; row < 3; row++) {
			//playerX[row] = 0;
			//playerO[row] = 0;
		}
		
	}

	public char[][] getBoard() {
		return board;
	}

   	public void setBoard(char[][] board) {
		this.board = board;
	}

	public void initialize() {
		int count = 0;
		GameBoard.turns = 0;
		for (int row = 0; row < 3; row++) {
			
			for (int col = 0; col < 3; col++) {
				board[row][col] = Character.forDigit((++count), 10);
				
			}
						
		}
		
	}//END INITIALIZE
	 
	public void displayBoard() {
		
		System.out.println(xBoarder);
		for (int row = 0; row < 3; row++) {
			
			for (int col = 0; col < 3; col++) {
				
				//board[row][col] = Character.forDigit((++count), 10);
				 System.out.print(yBoarder);
				 System.out.print(board[row][col]);
				
			}
			System.out.println(yBoarder);
			System.out.println(xBoarder);
					
		}
		
	}//END displayBoard
	
    public void processGame(Player aPlayer, int choice) {
				
		       
		    	switch (choice) {
				
				case 1:
					{						
						board[0][0] = aPlayer.getName();
					}
					break;
					
		        case 2:
		        {						
					board[0][1] = aPlayer.getName();
				}
					break;	
					
		        case 3:
		        {						
					board[0][2] = aPlayer.getName();
				}
		        	
		        case 4:
		        {						
					board[1][0] = aPlayer.getName();
				}
					break;
					
		        case 5:
		        {						
					board[1][1] = aPlayer.getName();
				}
					break;	
					
		        case 6:
		        {						
					board[1][2] = aPlayer.getName();
				}
		        	
		        case 7:
		        {						
					board[2][0] = aPlayer.getName();
				}
					break;
					
		        case 8:
		        {						
					board[2][1] = aPlayer.getName();
				}
					break;	
					
		        case 9:
		        {						
					board[2][2] = aPlayer.getName();
				}
		    	
		   }//END SWITCH
    	
		System.out.println(xBoarder);
		for (int row = 0; row < 3; row++) {
			
			for (int col = 0; col < 3; col++) {
				
				 System.out.print(yBoarder);
				 
				 System.out.print(board[row][col]);
		    }//END INNER FOR
			System.out.println(yBoarder);
			System.out.println(xBoarder);
			
		}//END OUTER FOR
		
	}//END processGame method 
	
	
	public static void setCombinations() {
				
		Set <Integer> combo_1 = new HashSet<Integer>((Arrays.asList(1, 2, 3)));
		
		combinations.add(combo_1);
		
       Set <Integer> combo_2 = new HashSet<Integer>((Arrays.asList(4, 5, 6)));
		
		combinations.add(combo_2);
		
       Set <Integer> combo_3 = new HashSet<Integer>((Arrays.asList(7, 8, 9)));
		
		combinations.add(combo_3);
		
       Set <Integer> combo_4 = new HashSet<Integer>((Arrays.asList(1, 4, 7)));
		
		combinations.add(combo_4);
		
		Set <Integer> combo_5 = new HashSet<Integer>((Arrays.asList(2, 5, 8)));
		
		combinations.add(combo_5);
		
       Set <Integer> combo_6 = new HashSet<Integer>((Arrays.asList(3, 6, 9)));
		
		combinations.add(combo_6);	
		
	   Set <Integer> combo_7 = new HashSet<Integer>((Arrays.asList(1, 5, 9)));
		
		combinations.add(combo_7);
		
       Set <Integer> combo_8 = new HashSet<Integer>((Arrays.asList(3, 5, 7)));
       
       combinations.add(combo_8);
       
      	
	}//END SETCOMBINATIONS
	
	public boolean checkForWinner(Player aPlayer) {
		boolean win = false;
		System.out.println("checking for a winner!");
				
		for (Set<Integer> pick: aPlayer.playerPicks) {
			
			Iterator<Set<Integer>> iterator = combinations.iterator();
			while (iterator.hasNext()) {
				
				Set <Integer> combo = new HashSet<Integer> (iterator.next());
								
				if (pick.containsAll(combo)){
							
					win = true;
					break;
				}
			}//END WHILE
			
			
		}
		return win;
	}

	
	public boolean checkGameStatus(Player aPlayer) {
		boolean winner = false;
		
		if (GameBoard.turns > 4 ) {
    		
   		 	winner = checkForWinner(aPlayer) ;
   			
   		}
   	  
		return winner;
	}
}
