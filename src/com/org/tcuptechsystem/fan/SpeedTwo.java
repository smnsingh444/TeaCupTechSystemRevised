package com.org.tcuptechsystem.fan;


class SpeedTwo implements State {

	
	public void pull(CeilingFanPullCord pull) {

		 if (pull instanceof CielingFanPullCordImpl) {
			pull.setSpeed(new SpeedThree());
			System.out.println("increasing speed to 3 ");
		}
		

	}
	
	@Override
	public String toString() {
		
		return "Speed 2";
	}
}