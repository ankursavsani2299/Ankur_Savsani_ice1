package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author ankur, 2020
 */
public class Card {

        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        public enum Joker {JOCKER1,JOCKER2 };
        private final Suit suit;
        private final Value value;
        private Joker joker;
        
        public Card(Suit s, Value gVal){
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}
	
	public Suit getSuit() {
		return this.suit;
        }
        public Joker getJoker() {
		return this.joker;
	}
}
        