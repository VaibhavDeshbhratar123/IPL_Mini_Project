package com.tka.client;

import java.util.Scanner;

import com.tka.controller.TeamController;

public class IPLClient {

	public static void main(String[] args) {
		TeamController teamController = new TeamController();
		Scanner sc = new Scanner(System.in);

		teamController.addTeamWithPlayers();

		System.out.println("\nEnter tean name to display its players : ");
		String teamName = sc.nextLine();
		if (teamName.equalsIgnoreCase(teamName)) {
			teamController.displayTeamPlayer(teamName);
		} else {
			System.out.println("please enter correct team name");
		}
	}

}
