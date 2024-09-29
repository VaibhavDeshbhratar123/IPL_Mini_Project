package com.tka.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int runs;
	private int wickets;
	private boolean isCaptain;
	private List<String> tags;

	public Player() {
		super();
	}

	public Player(String name, int runs, int wickets, boolean isCaptain) {
		super();
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.isCaptain = isCaptain;
		this.tags = new ArrayList<>();
		assignTags();
	}

	private void assignTags() {
		if (runs >= 2000) {
			tags.add("Batsman");
		} else if (wickets >= 200) {
			tags.add("Bowler");
		} else if (runs >= 1000 && wickets >= 50) {
			tags.add("AllRounder");
		} else {
			System.out.println("Invalid input");
		}
	}

	public String getName() {
		return name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public boolean isCaptain() {
		return isCaptain;
	}

	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}

	public List<String> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return "Player [Player name=" + name + ",Player runs=" + runs + ",Player wickets=" + wickets + ", isCaptain="
				+ isCaptain + " , " + tags + "]";
	}

}
