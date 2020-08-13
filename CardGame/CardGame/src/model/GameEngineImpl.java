package model;

import java.util.Collection;
import java.util.Deque;

import model.interfaces.GameEngine;
import model.interfaces.Player;
import model.interfaces.PlayingCard;
import view.interfaces.GameEngineCallback;

public class GameEngineImpl implements GameEngine{

	@Override
	public void dealPlayer(Player player, int delay) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

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
		
	}

	@Override
	public Player getPlayer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removePlayer(Player player) {
		// TODO Auto-generated method stub
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
		return null;
	}
	
	

}
