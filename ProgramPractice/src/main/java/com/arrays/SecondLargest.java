package com.arrays;

/**
 * 
 * @author slekh
 *
 */
public class SecondLargest {

	public static void main(String[] args) {
		
		int[] array={17,2,78,45,100,50};
		int secondLargest=SecondLargest.getSecondLargest(array);
		
	System.out.println("Second largest: "+secondLargest);
	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	
	public static int getSecondLargest(int[] array) {
		if(array.length==1){
			return -1;
		}
		
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:array){
			if(num>largest){
				second=largest;
				largest=num;
			}
		}
		return second;
	}

}
