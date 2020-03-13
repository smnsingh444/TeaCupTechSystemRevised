package com.org.tcuptechsystem.fan;


class SpeedOne implements State {
	
	

	public void pull(CeilingFanPullCord pull) {

	 if (pull instanceof CielingFanPullCordImpl) {
			pull.setSpeed(new SpeedTwo());
			System.out.println("increasing speed to 2");
		}

		
	}
	
	@Override
	public String toString() {
		
		return "Speed 1";
	}
}