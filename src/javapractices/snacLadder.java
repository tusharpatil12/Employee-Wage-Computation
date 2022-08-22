package javapractices;

public class snacLadder {

	public static void main(String[] args) {
		int rollDicePlayer1 =0;
		int dicePlayer1 =1;
		int POSITIONPlayer1 =0;
		int rallDicePlayer2 =0;
		int dicePlayer2 =0;
		int PlayOption =0;
		int POSITIONPlayer2 =0;
		
		while (POSITIONPlayer1<100&&POSITIONPlayer2<100) {
			System.out.println();
			rollDicePlayer1=(int)((Math.random()*6)+1);
			System.out.println("\nPLAYER1");
			System.out.println("Rolled Dice Value Player1:" +rollDicePlayer1);
			
			PlayOption=(int)Math.floor(Math.random()*10)%3;
			dicePlayer1++;
			
			switch(PlayOption) {
			case 0 :
				System.out.println("you encounted a Ladder");
				System.out.println("you can move"+rollDicePlayer1+"places ahead Player1.");
				POSITIONPlayer1+=rollDicePlayer1;
				break;
				
			case 1 :
				System.out.println("you encounted a snack");
				System.out.println("you can move"+rollDicePlayer1+"places ahead Player1.");
				POSITIONPlayer1+=rollDicePlayer1;
				break;
				
			case 2 :
				
				System.out.println("you got NO PLAY");
				System.out.println("you will have to skip your turn Player1.");
				
			}
			
			if(POSITIONPlayer1<0)
			    POSITIONPlayer1=0;
			    
			    else
			     	if(POSITIONPlayer1>100) {
			    	POSITIONPlayer1-=rollDicePlayer1;
			    	System.out.println("But Player 1 you need to score exactly" + (100-POSITIONPlayer1)+"to win the game.");
			    	
			    	}
			System.out.println("Current Position Player1:Squar"+ POSITIONPlayer1);
			System.out.println("\nPLAYER2");
			   int rollDicePlayer2=(int)((Math.random()*6)+1);
			   System.out.println("Rolled Dice Value Player2:"+rollDicePlayer2);
			
			PlayOption = (int) Math.floor(Math.random()*10)%3;
			
			dicePlayer2++;
			switch (PlayOption) {
			case 0 :
				System.out.println("you encountered a LADDER");
				System.out.println("you can move"+rollDicePlayer2+"places ahead Player2.");
				POSITIONPlayer2+=rollDicePlayer2;
				break;
				
			case 1 :
				
				System.out.println("you encountered a SNACK!");
				System.out.println("you can move"+rollDicePlayer2+"places ahead Player2.");
				POSITIONPlayer2+=rollDicePlayer2;
				break;
				
			case 2 :
				
				System.out.println("you got NO PLAY");
				System.out.println("you will have to skip your turn Player2.");
				
			}
			
			if(POSITIONPlayer1<0)
		    POSITIONPlayer2=0;
		    
		    else
		    	if(POSITIONPlayer2>100) {
			    	POSITIONPlayer2-=rollDicePlayer2;	
			    	System.out.println("But Player 1 you need toscore exactly" + (100-POSITIONPlayer2)+"to win the game.");
			    	
		}
			System.out.println("Current Position Player2:Squar"+ POSITIONPlayer2);
			
	}
		
		System.out.println();
		if(POSITIONPlayer1==100) {
		System.out.println("Player1 WINS THE GAME");}
		
		else
			System.out.println("Player2 WIN THE GAME!");
		System.out.println();
		System.out.println("Total Numbers of dice roll player1="+dicePlayer1);
		System.out.println("Total Numbers of dice roll player2="+dicePlayer2);
		System.out.println("Final Posiyion Player1 = "+POSITIONPlayer1);
		System.out.println("Final Posiyion Player2 = "+POSITIONPlayer2);
		
	}
	
}
