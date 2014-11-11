package com.string.util;

import org.junit.Assert;
import org.junit.Test;

public class PermutationUtilTests {

	private static final String STRING1 = "abcde";
	private static final String STRING2 = "bacde";
	private static final String STRING3 = "abcda";
	private static final String STRING4 = "abcdaf";

	@Test
	public void testReturnsTrueForPermutationStrings() {
		testPermutation(true, STRING1, STRING2);
	}
	
	@Test
	public void testReturnsFalseForNonPermutationStrings(){
		testPermutation(false, STRING1, STRING3);
	}
	
	@Test
	public void testReturnsFalseForUnequalLengthStrings(){
		testPermutation(false, STRING1, STRING4);
	}
	
	private void testPermutation(boolean condition, String str1, String str2){
		Assert.assertEquals(condition, PermutationUtil.isPermutation(str1, str2));
	}

}
