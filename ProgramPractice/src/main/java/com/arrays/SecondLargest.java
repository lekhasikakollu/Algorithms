package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] array={17,2,78,45,100,50};
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
	for(int num:array){
		if(num>largest){
			second=largest;
			largest=num;
		}
	}
	System.out.println("Second largest: "+second);
	}

}
