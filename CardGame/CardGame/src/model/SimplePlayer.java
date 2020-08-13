package model;

import model.interfaces.Player;

public class SimplePlayer implements Player{
	
	public String name;
	public String id;
	public int point;
	public int bet;
	public int result;
	
	public SimplePlayer(String id, String name, int initialPoints) {
		this.id = id;
		this.name = name;
		this.point = initialPoints;
	}

	@Override
	public String getPlayerName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayerName(String playerName) {
		// TODO Auto-generated method stub
		this.name = playerName;
		
	}

	@Override
	public int getPoints() {
		// TODO Auto-generated method stub
		return this.point;
	}

	@Override
	public void setPoints(int points) {
		// TODO Auto-generated method stub
		this.point = points;
		
	}

	@Override
	public String getPlayerId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean setBet(int bet) {
		// TODO Auto-generated method stub
		this.bet = bet;
		return false;
	}

	@Override
	public int getBet() {
		// TODO Auto-generated method stub
		return this.bet;
	}

	@Override
	public void resetBet() {
		// TODO Auto-generated method stub
		this.bet = 0;
	}

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		return this.result;
	}

	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub
		this.result = result;
	}

	@Override
	public boolean equals(Player player) {
		// TODO Auto-generated method stub
		if (this.result == player.getResult()) {
			return true;
		};		
		return false;
	}

	@Override
	public int compareTo(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}

}
