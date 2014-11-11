package com.math.util;

import org.junit.Assert;
import org.junit.Test;

public class PowerUtilTests {

	@Test
	public void testPowerReturnValueForInt() {
		double expected=Math.pow(5, 2);
		double actual=PowerUtil.pow(5, 2);
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testPowerReturnValueForDouble() {
		double expected=Math.pow(8.8, 2);
		double actual=PowerUtil.pow(8.8, 2);
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testPowerReturnValueForZeroExponent() {
		double expected=Math.pow(8.8, 0);
		double actual=PowerUtil.pow(8.8, 0);
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testPowerReturnValueForZeroBase() {
		double expected=Math.pow(0, 2);
		double actual=PowerUtil.pow(0, 2);
		Assert.assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testPowerReturnValueForZeroBaseAndExponent() {
		double expected=Math.pow(0, 0);
		double actual=PowerUtil.pow(0, 0);
		Assert.assertEquals(expected, actual, 0.0);
	}

}
