package com.string.util;

import java.util.HashMap;

public class IsomorphicUtil {

	public static boolean isIsomorphic(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		
		HashMap<Character, Integer> characters1=new HashMap<>();
		HashMap<Character, Integer> characters2=new HashMap<>();
		
		StringBuilder outputStr1=new StringBuilder();
		StringBuilder outputStr2=new StringBuilder();
		
		
 		for(int i=0;i<str1.length();i++){
 			char s=str1.charAt(i);
			char v=str2.charAt(i);
			
			if(!characters1.containsKey(s)){
				characters1.put(s, i);
			}
			outputStr1.append(characters1.get(s));
			
			if(!characters2.containsKey(v)){
				characters2.put(v, i);
			}
			outputStr2.append(characters2.get(v));	
 		}
 		if(!isEqualStrings(outputStr1, outputStr2)){
 			return false;
 		}
 		return true;
	}

	private static boolean isEqualStrings(StringBuilder outputStr1,
			StringBuilder outputStr2) {
		return outputStr1.toString().equalsIgnoreCase(outputStr2.toString());
	}
	
}
