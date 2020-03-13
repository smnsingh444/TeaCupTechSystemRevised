package com.org.tcuptechsystem.fan;

public enum Direction {
	
	COLCKWISE("CLOCK-WISE"),ANTICLOCKWISE("ANTI-CLOCKWISE");
	
	 
	    private final String direction;

	    private  Direction(String direction) {
	        this.direction = direction;
	    }

	    public String getValue() {
	        return direction;
	    }

		
}
