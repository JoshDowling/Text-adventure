package com.qa.TextAdventure;

import java.util.Scanner;
import java.util.Set;

public class Traveller {

	private String name;
	private String clss;
	private Integer pXCoord;
	private Integer pYCoord;

	public Traveller(String name, String clss, Integer pXCoord, Integer pYCoord) {
		super();
		this.name = name;
		this.clss = clss;
		this.pXCoord = pXCoord;
		this.pYCoord = pYCoord;

	}

	public static void newTraveller() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClss() {
		return clss;
	}

	public void setClss(String clss) {
		this.clss = clss;
	}

	public Integer getpXCoord() {
		return pXCoord;
	}

	public void setpXCoord(Integer pXCoord) {
		this.pXCoord = pXCoord;
	}

	public Integer getpYCoord() {
		return pYCoord;
	}

	public void setpYCoord(Integer pYCoord) {
		this.pYCoord = pYCoord;
	}

	public static void startPos() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you name Traveller: [type name] ");
		String name = s.nextLine();
		System.out.println("What are you Traveller? [type class] ");
		String clss = s.nextLine();
		System.out.println("Welcome " + name + ", the " + clss + "\nAre you ready? \nLet us begin");
		System.out.println(
				"\nYou are left alone with nothing but your 'Magic' compass, or so the shopkeeper said. \nIt is a small disk that you worked out does not necessarily point north.\n"
						+ "Looking around there is no points of reference just a large, damp, grey swamp");
	}
}
