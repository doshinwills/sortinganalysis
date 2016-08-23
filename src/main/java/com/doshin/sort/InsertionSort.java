package com.doshin.sort;

public class InsertionSort {
	
	//	static int array[] = { 8, 5, 1, 4, 2, 7, 6, 3, 9, 0 };

	public static void sort(int[] array) {
		//Array length - 1 iterations for all elements for pitot elemnt
		for (int indexI = 1; indexI < array.length; indexI++) {
			//From the pivot element move down one element till index of j grated than 0 and value of j-1 grater than value of j or swap 
			for (int indexJ = indexI; 0 < indexJ && array[indexJ - 1] > array[indexJ]; indexJ--) {
					swap(array, indexJ - 1, indexJ);
			}
		}
	}
	
	private static void swap(int[] array, int indexI, int indexJ) {
		int tempSwap = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = tempSwap;
	}


}
