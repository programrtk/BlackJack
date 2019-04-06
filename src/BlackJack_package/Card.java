package BlackJack_package;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
        public Card(){
            suit = "ZERO";
            face = 1;
        }


	// modifiers
        public void setSuit(String suitsetter){
            suit = suitsetter;
        }
        
        public void setFace(int faceSetter){
            face = faceSetter;
        }

 

  	//accessors
        public String getSuit(){
            return suit;
        }
        
        public int getFace(){
            return face;
        }





  	public abstract int getValue();

	public boolean equals(Object obj)
	{



		return false;
	}

  	//toString
        public String toString(){
            return FACES[face] + " of " + getSuit() + " | value = " + getValue();
        }
        
  	
 }