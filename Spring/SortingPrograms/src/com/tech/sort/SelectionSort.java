package com.tech.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 3, 7, 9, 5, 2, 4 };
		int temp;

		// first find the smallest number from an array with its index
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i; j < arr.length ; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			
		 
			// System.out.println(arr[temp]);

			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
