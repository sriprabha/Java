package com.string.util;



import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class UniqueCharUtilTests {

	private static final String UNIQUE_CHARS_STRING = "abcde";
	private static final String NO_UNIQUE_CHARS_STRING = "abcdea";
	private static final String BIG_STRING=StringUtils.leftPad("a", 257, "a");
	
	@Test
	public void testReturnsNullForNullString() {
		Assert.assertEquals(false, UniqueCharUtil.containsUniqueChars(null));
	}
	
	@Test
	public void testReturnsNullForStringGreaterThan256Chars(){
		testUniqueChars(false, BIG_STRING);
	}
	
	@Test
	public void testReturnsTrueForStringWithUniqueChars(){
		testUniqueChars(true, UNIQUE_CHARS_STRING);
	}
	
	@Test
	public void testReturnsFalseForStringWithNoUniqueChars(){
		testUniqueChars(false, NO_UNIQUE_CHARS_STRING);
	}
	
	private void testUniqueChars(boolean condition, String str){
		Assert.assertEquals(condition, UniqueCharUtil.containsUniqueChars(str));
	}

}
