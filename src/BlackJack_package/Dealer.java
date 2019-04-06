package BlackJack_package;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


//define Dealer class here
public class Dealer extends AbstractPlayer {
    
    
        //instance variable - Deck 
        
        private Deck deckOfCards;




	//constructors
           public Dealer(){
               deckOfCards = new Deck();
           }




	//method to shuffle

           public void shuffle(){
               deckOfCards.shuffle();
           }




	//method to deal a card
           public Card deal(){
               
           }



	//hit method goes here
          public boolean hit(){
              return true;
          }
}
