package com.org.tcuptechsystem.fan;


public class Off implements State {
	
	
    public void pull(CeilingFanPullCord pull) {
    	
      if (pull instanceof CielingFanPullCordImpl) {
			pull.setSpeed(new SpeedOne());
			System.out.println("increasing speed to 1");
		}

    }
    
	@Override
	public String toString() {
		
		return "Speed 0";
	}
}
