package com.sort;



/**
 * 
 * @author slekh
 *
 */
public class BubbleSortImpl implements BubbleSort{

	/**
	 * 
	 * @param resultArray
	 */
	public void printArray(int[] resultArray) {
		for(int i:resultArray){
			System.out.print(i+" ");
		}

	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public int[] sort(int[] array) {
		boolean swapped;
		int temp;
		int n=(array.length);
		for(int i=0;i<n-1;i++){
			swapped=true;
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			if(swapped==false)
				break;

		}
		return array;
	}

}

