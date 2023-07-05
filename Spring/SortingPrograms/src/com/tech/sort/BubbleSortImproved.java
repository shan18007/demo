package com.tech.sort;

public class BubbleSortImproved {

	public static void main(String[] args) {

		int arr[] = { 5, 2, -1, 4, 3 };
		int len = arr.length;
		int temp;
		int count=0;
		for (int i = 0; i < len - 1; i++) {
			
			boolean check = true;
			
			for (int j = 0; j < len - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					check=false;
				}
				count++;
			}
			if(check) {
				break;
			}
		}
		System.out.println("Swapping occurs: "+count+" times");
		System.out.println("After sorting array output is: ");
		
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
