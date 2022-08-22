package javapractices;

public class SnakeLadder0position {

	public static void main(String[] args) {
		int rollDice=0;
		int dice=0;
		int playOption=0;
		int POSITION=0;
		
		System.out.println("Wellcome to Snake Ladder Simulator");
		System.out.println("This Problem simulator a Snake and Ladder Game");
		System.out.println("The player start from 0 roll the die to get a number between 1 to 6, finds a safe place, ldder or a snake keeps doing till the winning sspot 100 is achived.");
		System.out.println("Let's begin the game...");
		System.out.println("Initial postion is Square Zero");
		System.out.println("Position:Square");
		
		
		for (dice=1;POSITION<100;dice++);
		
		System.out.println();
		rollDice=(int)((Math.random()*6)+1);
		System.out.println("Rolled Dice Value:"+rollDice);
		   playOption=(int)Math.floor(Math.random()*10)%3;
		   
		   
		   switch(playOption) {
		   case 0 :
			   System.out.println("You eucountered a LADDER");
			   System.out.println("You can move"+rollDice+"places ahead.");
			   
			   
			   
			   POSITION+=rollDice;
			   break;
			   
		   case 1 :
			   System.out.println("You eucountered a Snake");
			   System.out.println("You will move");
			   
			   POSITION-=rollDice;
			   break;
			   
		   case 2 :
			   System.out.println("You got NO");
			   System.out.println("You will have to skip your tern");
			   
			   if(POSITION<0);
			      POSITION=0;
			        
			   if(POSITION>100);
			   POSITION-=rollDice;
			   System.out.println("But you need to score exactly"+(100-POSITION)+"to win the game.");
			   System.out.println("Current Position:square"+POSITION);
			   
			   
			   System.out.println();
			   System.out.println("YOU WIN THE GAME!");
			   System.out.println();
			   System.out.println("Total Number of dice ralls played="+dice);
			   
			   
		   }
	
	}

}
