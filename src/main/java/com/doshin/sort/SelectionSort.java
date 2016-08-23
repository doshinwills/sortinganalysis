package com.doshin.sort;

public class SelectionSort {
	
	//int array[] = { 8, 5, 1, 4, 2, 7, 6, 3, 9, 0 };

	public static void sort(int[] array) {
		int exchangeIdex = 0;

		//set the pivot array location for the int to be exchnaged.
		for (int indexI = 0; indexI < array.length; indexI++) {
			//set the exchange as the same pivot array location just in case pivot element is the lowest
			exchangeIdex = indexI;
			//run through all elements starting next to pivot element
			for (int indexJ = indexI + 1; indexJ < array.length; indexJ++) {
				//if exchange element is greater than second array loop change exchangeIdex
				if (array[exchangeIdex] > array[indexJ])
					exchangeIdex = indexJ;
			}
			//swap values
			swap(array, exchangeIdex, indexI);
		}
	}

	private static void swap(int[] array, int exchangeIdex, int indexI) {
		int tempSwap = array[indexI];
		array[indexI] = array[exchangeIdex];
		array[exchangeIdex] = tempSwap;
	}

}
