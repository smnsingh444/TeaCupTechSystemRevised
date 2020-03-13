package com.org.tcuptechsystem.fan;

public class CielingFanPullCordImpl extends CeilingFanPullCord {
	
	

	// Assuming Fan will be initially in Off state
	public CielingFanPullCordImpl(State _currentSpeed,Direction _direction) {
		currentSpeed = _currentSpeed;
		direction=_direction;
	}
	
	

	@Override
	public String toString() {

		return "cord";
	}

}
