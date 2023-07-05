package com.service;

import java.util.*;

public class Check {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = sn.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sn.nextInt());
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) < list.get(i+1)) {
				list.remove(i);
				i--;
			}
		}
		System.out.println("List size: "+list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

	}

}
