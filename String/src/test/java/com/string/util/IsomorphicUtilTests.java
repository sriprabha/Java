package com.string.util;

import org.junit.Assert;
import org.junit.Test;


public class IsomorphicUtilTests {

	@Test
	public void testReturnsTrueForIsmorphicWords1() {
		Assert.assertEquals(true, IsomorphicUtil.isIsomorphic("foo","app"));
	}
	
	@Test
	public void testReturnsFalseForIsmorphicWords2() {
		Assert.assertEquals(false, IsomorphicUtil.isIsomorphic("bar","foo"));
	}
	
	@Test
	public void testReturnsFalseForIsmorphicWords1() {
		Assert.assertEquals(false, IsomorphicUtil.isIsomorphic("abca","zbxx"));
	}
	
	@Test
	public void testReturnsTrueForIsmorphicWords3() {
		Assert.assertEquals(true, IsomorphicUtil.isIsomorphic("abcadx","zbxzdc"));
	}
	
	@Test
	public void testReturnsTrueForIsmorphicWords4() {
		Assert.assertEquals(true, IsomorphicUtil.isIsomorphic("turtle","tletur"));
	}
	
	@Test
	public void testReturnsTrueForIsmorphicWords5() {
		Assert.assertEquals(true, IsomorphicUtil.isIsomorphic("ab","ca"));
	}

}
