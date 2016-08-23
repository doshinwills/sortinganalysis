package com.doshin.sort;

public class QuickSort {

	public static void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	private static void sort(int[] array, int first, int last) {
		if (last <=  first)
			return;
		int pivot = partition(array, first, last);
		sort(array, first, pivot - 1);
		sort(array, pivot + 1, last);
	}

	private static int partition(int[] array, int first, int last) {
		int pivotValue = array[first];
		int indexI = first;
		int inedexJ = last + 1;

		while (true) {
			while (array[++indexI] < pivotValue)
				if (indexI == last)
					break;

			while (pivotValue < array[--inedexJ])
				if (inedexJ == first)
					break;
			
			if(indexI >= inedexJ)
				break;

			swap(array, indexI, inedexJ);
		}
		
		swap(array, first, inedexJ);

		return inedexJ;

	}

	private static void swap(int[] array, int indexI, int indexJ) {
		int tempSwap = array[indexI];
		array[indexI] = array[indexJ];
		array[indexJ] = tempSwap;
	}

	public static void main(String[] args) {
		int array[] = { 6, 0, 1, 4, 2, 7, 8, 3, 9, 5 ,11,10,};
		sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

}
