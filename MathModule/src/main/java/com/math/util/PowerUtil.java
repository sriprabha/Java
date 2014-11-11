package com.math.util;


/**
 * Util that implements the pow functionality 
 * without using the predefined pow.
 * 
 * @author Sriprabha Gopalan
 *
 */
public final class PowerUtil {

	public static final double pow(final double base, final int exponent){
		if(exponent==0){
			return 1;
		}
		double result=base;
		
		for(int i=0;i<exponent-1;i++){
			result*=result;
		}
		return result;
	}
	
}
