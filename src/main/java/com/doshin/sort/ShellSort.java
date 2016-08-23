package com.doshin.sort;

public class ShellSort {

	public static void sort(int[] array) {

		int hValue = 1;
		
		//get highest h sorting value
		while (hValue < array.length/3) {
			hValue = hValue * 3 + 1;
		}
		
		//Run till h is not 0
		while (0 < hValue) {
			//Start with h value to end times
			for (int indexI = hValue; indexI < array.length; indexI++) {
				//start with h I and then to hvalue spots back
				for (int indexJ = indexI; 
						//h from the array is already taken care by array[indexJ - hValue]
						//to bring the smallest elemnet to h spots back till  the value is in correct spot
						hValue <= indexJ && array[indexJ - hValue] > array[indexJ]; 
						indexJ -= hValue) {
					swap(array, indexJ - hValue, indexJ);
				}
			}
			hValue /= 3;
		}
	}

	private static void swap(int[] array, int indexI, int indexJ) {
		int tempSwap = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = tempSwap;
	}

	public static void main(String[] args) {
		int array[] = { 8, 5, 1, 4, 2, 7, 6, 3, 9, 0 };

		sort(array);

		for (int intdexJ = 0; intdexJ < array.length; intdexJ++) {
			System.out.print(array[intdexJ] + ", ");
		}
	}

}
