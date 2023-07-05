package com.tech.searching;

public class LinearSearch {

	public static void main(String[] args) {

		int arr[] = {5,7,6,8,3,1};
		
		int element=8;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==element) {
				System.out.println("element found at: "+(i+1)+"th position");
			}
		}
	}

}
