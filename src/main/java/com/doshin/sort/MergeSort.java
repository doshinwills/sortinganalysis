package com.doshin.sort;

public class MergeSort {

	public static void sort(int[] array) {
		sort(array, new int[array.length], 0, array.length - 1);
	}

	private static void sort(int[] array, int[] arrayAux, int start, int end) {
		// if both the elemnets points to the same location no need for any more sort just return
		if (start >= end)
			return;
		//Get the mid to divide the array and initiate a sort for arrays
		int mid = start + (end - start) / 2;
		//start sort for first set of array till there only 2 elements from start and mid
		sort(array, arrayAux, start, mid);
		//start sort for secound set of array till there only 2 elements from start and mid
		sort(array, arrayAux, mid + 1, end);
		// merge the array on the sorted subset 
		merge(array, arrayAux, start, mid, end);
	}

	private static void merge(int[] array, int[] arrayAux, int start, int mid,
			int end) {
		//copy to aux array
		for (int indexK = start; indexK <= end; indexK++) {
			arrayAux[indexK] = array[indexK];
		}

		//fins the start of first and second array
		int indexI = start, indexJ = mid + 1;
		//run the aux array from start to end
		for (int indexK = start; indexK <= end; indexK++) {
			//if first array is finised stop and fill with secound array
			if (indexI > mid)
				array[indexK] = arrayAux[indexJ++];
			//if second array is finised stop and fill with first array
			else if (indexJ > end)
				array[indexK] = arrayAux[indexI++];
			//if first array element is low fill that element and viz a viv
			else if (arrayAux[indexI] < arrayAux[indexJ])
				array[indexK] = arrayAux[indexI++];
			else
				array[indexK] = arrayAux[indexJ++];
		}

	}

	public static void main(String[] args) {
		int array[] = { 8, 5, 1, 4, 2, 7, 6, 3, 9, 0 };
		sort(array);
		
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
