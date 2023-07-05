package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list =new ArrayList<Integer>();
		
		while(true) {
			int num= sc.nextInt();
			if(num>=0) {
				list.add(num);
			}else {
				break;
			}
		}
		System.out.println(check(list));
		
	}
	public static int check(List<Integer> list) {
		int count=0;
		for(Integer i:list) {
			if(i>100) {
				count++;
			}
		}
		return count;
	}
}
