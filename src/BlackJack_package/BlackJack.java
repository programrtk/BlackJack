package BlackJack_package;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
        private Dealer dealer;
	//add in Dealer instance variable
        private Player player;
        
        
	public BlackJack()
	{
        dealer = new Dealer();
        player = new Player();
        boolean start = true;

	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		char choice = 0;

                if(start){
                    start;
                }



	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}