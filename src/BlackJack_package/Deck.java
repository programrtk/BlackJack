package BlackJack_package;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<>();
		
		//loop through suits
			//loop through faces
				//add in a new card
		for(int i = 0; i < NUMSUITS; i++){
                   for(int x = 0; x < NUMFACES; x++){
                       BlackJackCard bCrd = new BlackJackCard();
                       bCrd.setFace(x);
                       stackOfCards.add(bCrd);
                       
                   }
                }
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
            Collections.shuffle(stackOfCards);
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return stackOfCards.size();
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}