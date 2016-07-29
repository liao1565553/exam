package com.hand;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("请输入日期：");
		
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		int year, month, day;
		int counts=0;

		try {
			year = getYear(date);
			month = getMonth(date);
			day = getDay(date);
			if(year<=0){
				System.err.println("您输入的年不合法");
			}
			if(month>12||month<1){
				System.err.println("您输入的月不合法");
			}
			if(day>31||day<1){
				System.err.println("您输入的天不合法");
			}
			
			
			boolean isRyear=false;
			
			if(((year%4)==0&&(year%100!=0))||(year%400==0)){
				isRyear=true;
			}
			
			int monthOfdays[]={31,28,31,30,31,30,31,31,30,31,30,31};
			int RmonthOfdays[]={31,28,31,30,31,30,31,31,30,31,30,31};
			if (isRyear) {
				for(int i=0;i<month-1;i++){
					counts+=monthOfdays[i];
				}
				counts+=day;
			}else {
				for(int i=0;i<month-1;i++){
					counts+=RmonthOfdays[i];
				}
				counts+=day;
			}
			
			System.out.println("你输入的日期为当年的第 "+counts+"天");
			
		} catch (Exception e) {
			System.out.println("您输入的格式有误请重新输入（yyyy-mm-dd）");
		}

	}

	public static int getYear(String date) {
		return Integer.parseInt((String) date.subSequence(0, 4));
	}

	public static int getMonth(String date) {
		return Integer.parseInt((String) date.subSequence(5, 7));
	}

	public static int getDay(String date) {
		return Integer.parseInt((String) date.subSequence(8, 10));
	}
}
