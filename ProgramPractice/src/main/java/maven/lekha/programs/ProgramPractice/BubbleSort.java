package maven.lekha.programs.ProgramPractice;

import java.util.Scanner;

/**
 * The Bubble sort is the most basic sorting algorithms.
 * After each iteration , the maximum element bubbles up to the end.
 * Hence it`s name Bubble Sort.
 * 
 * The best case time complexity is when the elements are already sorted . It takes O(n) time.
 * The average and worst case time complexities are O(n^2). 
 *
 * @author lekhasikakollu
 * @param array			the input array containing unsorted elements
 * @param num			the number of elements in the array.
 * @return				the result array having the elements in sorted order.
 * 
 *
 */


public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj=new BubbleSort();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of elements : ");
		int num=scan.nextInt();
		int[] array=new int[num];
		System.out.println("Enter the elements of the array :");

		for(int i=0;i<num;i++){
			array[i]=scan.nextInt();
		}

		System.out.print("\n\nBefore sorting :");
		obj.printArray(array);

		int[] resultArray=obj.sort(array);
		System.out.print("\n\nSorted array :");
		obj.printArray(resultArray);
		scan.close();

	}
//A utility to print all the contents of the array.
	void printArray(int[] resultArray) {
		for(int i:resultArray){
			System.out.print(i+" ");
		}

	}

//Method to sort the elements of the array.It returns the sorted array.
	int[] sort(int[] array) {
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

