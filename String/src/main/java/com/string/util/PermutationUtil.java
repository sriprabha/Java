package com.string.util;

/**
 * A util to check if a string str1 is a permutation 
 * of another string str2 or vice versa.
 * 
 * @author Sriprabha Gopalan
 *
 */
public class PermutationUtil {

	public static boolean isPermutation(final String str1, final String str2){
		if(str1.length()!=str2.length())
			return false;
		
		int count[]=new int[256];
		
		for(char c:str1.toCharArray()){
			count[c]++;
		}
		
		for(char c:str2.toCharArray()){
			count[c]--;
			if(count[c]<0){
				return false;
			}
		}
		
		return true;
	}
}
