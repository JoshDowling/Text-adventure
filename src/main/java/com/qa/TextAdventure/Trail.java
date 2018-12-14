package com.qa.TextAdventure;

public class Trail {

	private Integer tXCoord;
	private Integer tYCoord;
	
	
	public Trail(Integer tXCoord, Integer tYCoord) {
		super();
		this.tXCoord = tXCoord;
		this.tYCoord = tYCoord;
	
	
	}


	public Integer gettXCoord() {
		return tXCoord;
	}


	public void settXCoord(Integer tXCoord) {
		this.tXCoord = tXCoord;
	}


	public Integer gettYCoord() {
		return tYCoord;
	}


	public void settYCoord(Integer tYCoord) {
		this.tYCoord = tYCoord;
	}
	
	
}
