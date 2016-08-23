package com.doshin;

import java.util.Arrays;
import java.util.Random;

import com.doshin.sort.InsertionSort;
import com.doshin.sort.MergeSort;
import com.doshin.sort.QuickSort;
import com.doshin.sort.SelectionSort;
import com.doshin.sort.ShellSort;

public class MainClass {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Time Took for sorts");
		System.out
				.println("No of Elements\tSystem Sort\tSelection Sort\tInsertion Sort\tShell Sort\tMerge Sort\tQuick Sort");

		for (int indexI = 0; indexI < 200; indexI++) {
			int arraySelection[] = new int[1000 * indexI];
			int arrayInsertion[] = new int[1000 * indexI];
			int arrayShell[] = new int[1000 * indexI];
			int arrayTwo[] = new int[1000 * indexI];

			for (int indexK = 0; indexK < 1000 * indexI; indexK++) {
				int value = rand.nextInt();
				arraySelection[indexK] = value;
				arrayInsertion[indexK] = value;
				arrayShell[indexK] = value;
				arrayTwo[indexK] = value;
			}

			long selectionSortTime = 0, insertionSortTime = 0, shellSortTime = 0, systemSortTime = 0, mergeSortTime = 0, quickSortTime = 0;

			systemSortTime = analyseSystemSort(arrayTwo);

//			 selectionSortTime = analyseSelectionSort(arraySelection,
//			 arrayTwo);

//			 insertionSortTime = analyseInsertionSort(arrayInsertion,
//			 arrayTwo);
			 
			 shellSortTime = analyseShellSort(arrayInsertion,
			 arrayTwo);

			mergeSortTime = analyseMergeSort(arrayInsertion, arrayTwo);
//			
			quickSortTime = analyseQuickSort(arraySelection, arrayTwo);


			System.out.println((1000 * indexI) + "\t" + systemSortTime + "\t"
					+ selectionSortTime + "\t" + insertionSortTime + "\t"
					+ shellSortTime + "\t" + mergeSortTime + "\t" + quickSortTime);

		}

	}
	


	private static long analyseSystemSort(int[] arraySelection) {
		long startTime = System.currentTimeMillis();
		Arrays.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		return (endTime - startTime);

	}
	
	private static long analyseQuickSort(int[] arraySelection, int[] arrayTwo) {
		long startTime = System.currentTimeMillis();
		QuickSort.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		for (int intdexJ = 0; intdexJ < arraySelection.length; intdexJ++) {
			if (arraySelection[intdexJ] != arrayTwo[intdexJ]) {

				System.out.println("Sorted wrong in " + (endTime - startTime));
				break;
			}

		}
		return (endTime - startTime);
	}

	private static long analyseMergeSort(int[] arraySelection, int[] arrayTwo) {
		long startTime = System.currentTimeMillis();
		MergeSort.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		for (int intdexJ = 0; intdexJ < arraySelection.length; intdexJ++) {
			if (arraySelection[intdexJ] != arrayTwo[intdexJ]) {

				System.out.println("Sorted wrong in " + (endTime - startTime));
				break;
			}

		}
		return (endTime - startTime);
	}

	private static long analyseShellSort(int[] arraySelection, int[] arrayTwo) {
		long startTime = System.currentTimeMillis();
		ShellSort.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		for (int intdexJ = 0; intdexJ < arraySelection.length; intdexJ++) {
			if (arraySelection[intdexJ] != arrayTwo[intdexJ]) {

				System.out.println("Sorted wrong in " + (endTime - startTime));
				break;
			}

		}
		return (endTime - startTime);
	}

	private static long analyseInsertionSort(int[] arraySelection,
			int[] arrayTwo) {
		long startTime = System.currentTimeMillis();
		InsertionSort.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		for (int intdexJ = 0; intdexJ < arraySelection.length; intdexJ++) {
			if (arraySelection[intdexJ] != arrayTwo[intdexJ]) {

				System.out.println("Sorted wrong in " + (endTime - startTime));
				break;
			}

		}
		return (endTime - startTime);
	}

	private static long analyseSelectionSort(int[] arraySelection,
			int[] arrayTwo) {
		long startTime = System.currentTimeMillis();
		SelectionSort.sort(arraySelection);
		long endTime = System.currentTimeMillis();

		for (int intdexJ = 0; intdexJ < arraySelection.length; intdexJ++) {
			if (arraySelection[intdexJ] != arrayTwo[intdexJ]) {

				System.out.println("Sorted wrong in " + (endTime - startTime));
				break;
			}

		}
		return (endTime - startTime);
	}

}
