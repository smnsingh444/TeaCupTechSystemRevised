package com.org.tcuptechsystem.fan.test;

import org.junit.Test;

import com.org.tcuptechsystem.fan.CeilingFanPullCord;
import com.org.tcuptechsystem.fan.CielingFanPullCordImpl;
import com.org.tcuptechsystem.fan.Direction;
import com.org.tcuptechsystem.fan.Off;
import com.org.tcuptechsystem.fan.State;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class CiellingFanPullCordTest {

	CeilingFanPullCord cord;

	@Before
	public void setUp() throws Exception {
		cord = new CielingFanPullCordImpl(new Off(),Direction.COLCKWISE);

	}

	@After
	public void tearDown() throws Exception {
		cord = null;
	}

	@Test
	public void testCielingPullCordClockWiseForAllSpeeds() {
		System.out.println("Testing CielingPullCord in Clock-Wise  Direction");
		State zeroSpeed = cord.getSpeed();
		assertEquals(zeroSpeed.toString(), "Speed 0");
		cord.pull();
		State SpeedOne = cord.getSpeed();
		assertEquals(SpeedOne.toString(), "Speed 1");
		cord.pull();
		State SpeedTwo = cord.getSpeed();
		assertEquals(SpeedTwo.toString(), "Speed 2");
		cord.pull();
		State SpeedThree = cord.getSpeed();
		assertEquals(SpeedThree.toString(), "Speed 3");
		cord.pull();
		State againOff = cord.getSpeed();
		assertEquals(againOff.toString(), "Speed 0");
	}

	@Test
	public void testCielingPullCordInReverse() {
		System.out.println("Testing Cord for Reverse Direction");

		State zeroSpeed = cord.getSpeed();
		assertEquals(zeroSpeed.toString(), "Speed 0");
		cord.pull();
		State SpeedOne = cord.getSpeed();
		assertEquals(SpeedOne.toString(), "Speed 1");
		Direction direction=cord.getDirection();
		assertEquals(direction.COLCKWISE.getValue(), "CLOCK-WISE");

		System.out.println("**********************Reversing Cord*************");

		CeilingFanPullCord reverseCord = new CielingFanPullCordImpl(cord.getSpeed(),Direction.ANTICLOCKWISE);

		State SpeedOneBeforeReverse = reverseCord.getSpeed();
		assertEquals(SpeedOneBeforeReverse.toString(), "Speed 1");
		reverseCord.pull();
		State speedTwoAfterReversePull = reverseCord.getSpeed();
		assertEquals(speedTwoAfterReversePull.toString(), "Speed 2");
		reverseCord.pull();
		State speedThreeAFterPullInReverse = reverseCord.getSpeed();
		assertEquals(speedThreeAFterPullInReverse.toString(), "Speed 3");
		Direction antiDirection=reverseCord.getDirection();
		assertEquals(antiDirection.ANTICLOCKWISE.getValue(), "ANTI-CLOCKWISE");
		assertEquals(speedThreeAFterPullInReverse.toString(), "Speed 3");
		
		
		

	}

}
