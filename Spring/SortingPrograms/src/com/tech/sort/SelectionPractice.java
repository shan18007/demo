package com.tech.sort;

public class SelectionPractice {

	public static void main(String[] args) {

		int arr[] = { 3, 7, 9, 5, 2, 4 };
		
		for (int i = 0; i < arr.length; i++) {
			int index=i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[index]) {
					index = j;
				}
			}

			int t = arr[i];
			arr[i] = arr[index];
			arr[index] = t;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}

