package com.org.tcuptechsystem.fan;


class SpeedThree implements State {

	
	public void pull(CeilingFanPullCord pull) {
		
		 if (pull instanceof CielingFanPullCordImpl) {
			pull.setSpeed(new Off());
			System.out.println("increasing speed to off/speed 0 ");
		}
		
	}
	
	@Override
	public String toString() {
		
		return "Speed 3";
	}
}