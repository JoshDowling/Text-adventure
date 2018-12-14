package com.qa.TextAdventure;

public class Trail {

	private Integer tXCoord;
	private Integer tYCoord;
	
	
	public Trail(Integer tXCoord, Integer tYCoord) {
		super();
		this.tXCoord = tXCoord;
		this.tYCoord = tYCoord;
		
	}
//	public void getCoord() {
//	getCoord(getXCoord()getYCoord());
//	
	


	public Integer getXCoord() {
		return tXCoord;
	}


	public void setXCoord(Integer tXCoord) {
		this.tXCoord = tXCoord;
	}


	public Integer getYCoord() {
		return tYCoord;
	}


	public void setYCoord(Integer tYCoord) {
		this.tYCoord = tYCoord;
	}
	
	
}
