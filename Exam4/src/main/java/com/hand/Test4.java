package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test4 {
	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer, Integer> maps=new HashMap<Integer, Integer>();
		for (int i = 0; i < 50; i++) {
			list.add((int) (Math.random() * 100));
		}
		for(int i=0;i<list.size();i++){
			maps.put(list.get(i)/10, list.get(i));
		}
		
		System.out.print("随机生成50个小于100的值，分别是：");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"  ");
		}
		System.out.print("\nMap中的数据为：");
		
		
		
		
	
	}
}
