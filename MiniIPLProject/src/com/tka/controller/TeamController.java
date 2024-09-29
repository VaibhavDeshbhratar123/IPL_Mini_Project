package com.tka.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tka.entity.Player;
import com.tka.entity.Team;

public class TeamController {
	List<Team> teams = new ArrayList<Team>();

	public void addTeamWithPlayers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name : ");
		String teamName = sc.nextLine();
		Team team = new Team(teamName);
		teams.add(team);
		System.out.println("Enter the details for 3 players : ");
		for (int i = 1; i <=3; i++) {
			System.out.println("Enter the details for player " + i + " : ");
			System.out.println("Player Name : ");
			String name = sc.nextLine();
			System.out.println("Player runs : ");
			int runs = sc.nextInt();
			System.out.println("Players Wicket : ");
			int wickets = sc.nextInt();
			System.out.println("is captain (true/false) : ");
			boolean isCaptain = sc.nextBoolean();
			sc.nextLine();

			Player player = new Player(name, runs, wickets, isCaptain);
			team.addPlayer(player);
		}
	}

	public void displayTeamPlayer(String teamName) {
		for (Team team : teams) {
			if (team.getTeamName().equalsIgnoreCase(teamName)) {
				System.out.println("team : " + teamName);
				for (Player player : team.getPlayers()) {
					System.out.println(player);
				}
				return;
			}
		}
		System.out.println("Team not found");
	}
}
