package com.hand;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		int half = 0;
		boolean isSuShu = true;
		int count = 0;
		List<Integer> lists= new ArrayList<Integer>();
		for (int i = 101; i <= 200; i++) {
			half = i / 2;
			for (int j = 2; j < half; j++) {
				if ((i % j) == 0) {
					isSuShu = false;
				}
			}
			if (isSuShu) {
				count++;
				lists.add(i);
			}
			isSuShu = true;
		}
		System.out.print("101-200之间一共有" + count+"个素数，分别是：");
		Iterator<Integer> iterator=lists.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+",");
			
		}
	}
}
