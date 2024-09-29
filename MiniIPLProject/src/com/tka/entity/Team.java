package com.tka.entity;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String teamName;
	private List<Player> players;

	public Team(String teamName) {
		super();
		this.teamName = teamName;
		this.players = new ArrayList<>();
	}

	public String getTeamName() {
		return teamName;
	}

	public List<Player> getPlayers() {
		return players;
	}
	public void addPlayer(Player player) {
		this.players.add(player);
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}

}
