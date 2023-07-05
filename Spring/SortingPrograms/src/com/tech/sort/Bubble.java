package com.tech.sort;

public class Bubble {

	public static void main(String[] args) {
		int arr[] = {2,5,-1,3,8,7};
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int h:arr) {
			System.out.print(h+" ");
		}
	}

}
