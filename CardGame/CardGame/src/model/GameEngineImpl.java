package model;

import java.util.Collection;
import java.util.Deque;

import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import view.interfaces.GameEngineCallback;

public class GameEngineImpl implements GameEngine{
	/*
	 * we need
	 * 1. players: maybe like an array? i think it should be Collection<Player>
	 * 2. a shuffled deck - Deque<PlayingCard>
	 * 3. Bet point in the middle? - double check how the bet system works 
	 * 4. we need a house - we need to find out what the difference between normal
	 *  player and house and if there are big difference, we need to create another 
	 *  class inheriting player interface*/
	
	
	/*note : Player points are not changed by placing a bet, 
	 * they are only changed after the House has dealt and the win/loss has been
	determined.*/
	@Override
	public void dealPlayer(Player player, int delay) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	/*Players are only competing against the house to win more points, 
	 * with their win loss determined only by their own and the
		House’s dealt cards, not by the other players.*/
	@Override
	public void dealHouse(int delay) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyWinLoss(Player player, int houseResult) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		// instantiate a Player object from class, then add them into the Collection<Player>
	}

	@Override
	public Player getPlayer(String id) {
		// TODO Auto-generated method stub
		//return player 
		return null;
	}

	@Override
	public boolean removePlayer(Player player) {
		// TODO Auto-generated method stub
		//remove player from  the Collection<Player>
		return false;
	}

	@Override
	public boolean placeBet(Player player, int bet) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removeGameEngineCallback(GameEngineCallback gameEngineCallback) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Deque<PlayingCard> getShuffledHalfDeck() {
		// TODO Auto-generated method stub
		/* create a deque<playingCard> with DECK_SIZE defined in PlayingCard.java
		 * come up with an algorism that randomly shuffle and create a deck (double check if using random library is okay)
		*/
		return null;
	}
	
	

}
