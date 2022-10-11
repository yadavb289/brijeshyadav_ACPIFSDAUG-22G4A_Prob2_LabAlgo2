package com.lab2.currencycounter;

public class MergeSorting {
	public  void conquer(int[] arr, int startingIndex, int middleIndex, int endingIndex) {
		int[] merger = new int[endingIndex - startingIndex + 1];
		int idx1 = startingIndex;
		int idx2 = middleIndex + 1;
		int x = 0;

		while (idx1 <= middleIndex && idx2 <= endingIndex) {
			if (arr[idx1] <= arr[idx2]) {
				merger[x++] = arr[idx1++];
			} else {
				merger[x++] = arr[idx2++];
			}
		}
		while (idx1 <= middleIndex) {
			merger[x++] = arr[idx1++];
		}
		while (idx2 <= endingIndex) {
			merger[x++] = arr[idx2++];
		}
		for (int i = 0, j = startingIndex; i < merger.length; i++, j++) {
			arr[j] = merger[i];
		}
	}

	public  void divide(int[] arr, int startingIndex, int endingIndex) {
		if (startingIndex >= endingIndex) {
			return;
		}
		int middleIndex = startingIndex + (endingIndex - startingIndex) / 2;
		divide(arr, startingIndex, middleIndex);
		divide(arr, middleIndex + 1, endingIndex);
		conquer(arr, startingIndex, middleIndex, endingIndex);
	}

}
