package com.qa.TextAdventure;

import java.util.*;

public class App {

	public static void main(String[] args) {

		// Trail trail = new Trail(5, -3);

		System.out.println("-* Welcome to the Swamp *- a kind wanderer says as you pass.\n");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter you name Traveller: [type name] ");
		String name = s.nextLine();
		System.out.println("What are you Traveller? [type class] ");
		String clss = s.nextLine();
		System.out.println("Welcome " + name + ", the " + clss + "\nAre you ready? \nLet us begin");
		System.out.println(
				"\nYou are left alone with nothing but your 'Magic' compass, or so the shopkeeper said. \nIt is a small disk that you worked out does not necessarily point north.\n"
						+ "Looking around there is no points of reference just a large, damp, grey swamp");

		System.out.println("\nWhich direction would you like to go? [north, east, south, west?] ");
		String d1 = s.nextLine();
		System.out.println("You go " + d1);

		System.out.println(
				"You passed the first test.\nWhich direction would you like to go? [north, east, south, west?] ");
		String d2 = s.nextLine();
		System.out.println("You go " + d2);
		if (d2.equals("west")) {
			System.out.println("You are on the right track, well done!\nThe compass shows that you are close");
		} else
			System.out.println("You are already lost, the compass points 'west'!\nYou follow it.");

		System.out.println(
				"You passed the second test.\nWhich direction would you like to go now? [north, east, south, west?] ");
		String d3 = s.nextLine();
		System.out.println("You go " + d3);
		if (d3.equals("north")) {
			System.out.println("You are on the right track, well done!\nThe compass shows that you are close");
		} else
			System.out.println(
					"You are already lost, the compass points 'north'!\nYou feel this is the best course of action.");

		System.out.println(
				"You passed the third test.\nWhich direction would you like to go now? [north, east, south, west?] ");
		String d4 = s.nextLine();
		System.out.println("You go " + d4);
		if (d4.equals("east")) {
			System.out.println(
					"You are there!\nThe compass shows that you are very close.\nYou can hear a noise like bells.");
		} else
			System.out.println(
					"You are already lost, the compass points 'east'!\nyou feel this is the best course of action.");

		System.out.println(
				"\n\nYou go into a clearing. You see a large bearded figure in red. He looks angry and ready to attack!\n"
						+ "Do you attack or run?");
		String d5 = s.nextLine();
		System.out.println("You " + d5);
		if (d5.equals("attack")) {
			System.out.println(
					"The large bearded figure falls down injured revealing a large treasure trove. Congratulations you have won the game!");
		} else
			System.out.println("You try to escape but the large figure catches you and eats you");

		System.out.println("This ends the Adventure. Thank you for playing");

	}
	// public String getCoord(int treasPosition){
	// int p1 ;for(
	// int p = 0;p==3;p++)
	// {
	// while (p1 < 6);{
	//
	// System.out.println("The compass points north."
	// String d1= s.nextLine();
	// if (d1.equals("north")) {
	//
}

// }else System.out.println("You are already lost, go back");
