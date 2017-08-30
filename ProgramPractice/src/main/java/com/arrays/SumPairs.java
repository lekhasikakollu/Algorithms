package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class SumPairs {

	public static void main(String[] args) {
		int[] array={17,4,15,13,26,15,89,3};
		int sum=30;
		getSumPairs(array,sum);
	}

	static void getSumPairs(int[] array,int sum){
		if(array.length<2)
			System.out.println("invalid input");
		Set<Integer> set=new HashSet<Integer>(array.length);

		for(int num:array){
			int difference=sum-num;
			if(!set.contains(difference)){
				set.add(num);
			}else{
				System.out.println("Pair: ("+num+","+difference+")");
			}

		}
	}

}
