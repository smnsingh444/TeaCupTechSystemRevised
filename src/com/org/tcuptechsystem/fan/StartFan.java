package com.org.tcuptechsystem.fan;

public class StartFan {
	
	private static int PULL_COUNT=5;
	 
	public static void main(String[] args) {
		
	
		
        CeilingFanPullCord cord = new CielingFanPullCordImpl(new Off(),Direction.COLCKWISE);
       
        System.out.println("************** cord is pulled clockwise**********");
        for (int i = 0; i < PULL_COUNT; i++) {
        	cord.pull();
		}
        System.out.println("Direction before reverse cord is pulled : "+cord.getDirection().getValue());
        
        System.out.println("************** cord is pulled antiClockwise**********");
        cord=new CielingFanPullCordImpl(cord.getSpeed(),Direction.ANTICLOCKWISE);
        for (int i = 0; i < PULL_COUNT; i++) {
        	cord.pull();
		}
        System.out.println("Direction after reverse cord is pulled : "+cord.getDirection().getValue());
        
        for (int i = 0; i < PULL_COUNT; i++) {
        	cord.pull();
		}
        System.out.println("Cord remains in same state : "+cord.getDirection().getValue());
       
    }


}
