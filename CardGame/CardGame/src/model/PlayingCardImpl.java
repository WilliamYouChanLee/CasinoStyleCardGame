package model;

import model.interfaces.PlayingCard;
import model.interfaces.PlayingCard.Suit;
import model.interfaces.PlayingCard.Value;

public class PlayingCardImpl implements PlayingCard{

	private Suit CardSuit;
	private Value CardValue;
	private int score;

	public PlayingCardImpl(String suit, String value) {
		//constructor should create array/array list or some sort of object that depicts 28 card shuffled
		this.CardSuit = Suit.valueOf(suit);
		this.CardValue = Value.valueOf(value);
		this.score = 0;		
	}

	@Override
	public Suit getSuit() {
		// TODO Auto-generated method stub
		return this.CardSuit;
	}

	@Override
	public Value getValue() {
		// TODO Auto-generated method stub
		return this.CardValue;
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public boolean equals(PlayingCard card) {
		// TODO Auto-generated method stub
		if(this.score == card.getScore()) {
			return true;
		}
		return false;
	}

}
