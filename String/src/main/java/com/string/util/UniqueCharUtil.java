package com.string.util;


/**
 * Util to check if a string has all unique characters.
 * All the characters in the string are ASCII chars.
 * 
 * @author Sriprabha Gopalan
 *
 */
public final class UniqueCharUtil {
		
	public static boolean containsUniqueChars(final String input){
		if(input==null)
			return false;
		if(input.length()>256){
			return false;
		}
		
		boolean[] uniqueChar=new boolean[256];
		for(int i=0;i<input.length();i++){
			int val=input.charAt(i);
			if(uniqueChar[val]){
				return false;
			}
			uniqueChar[val]=true;
		}
		return true;
	}
}
