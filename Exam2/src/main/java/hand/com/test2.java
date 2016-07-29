package hand.com;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		System.out.print("请输入工资：");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int needpay = salary - 3500;
		int pay = 0;
		if (needpay > 0 && needpay <= 1500) {
			pay = (int) (needpay * 0.03);
		} else if (needpay > 1500 && needpay <= 4500) {
			pay = (int) ((needpay - 1500) * 0.1 + 45);
		} else if (needpay > 4500 && needpay <= 9000) {
			pay = (int) ((needpay - 4500) * 0.2 + 345);
		} else if (needpay > 9000 && needpay <= 35000) {
			pay = (int) ((needpay - 9000) * 0.25+1245);
		} else if (needpay > 35000 && needpay <= 55000) {
			pay = (int) ((needpay - 35000) * 0.3+7745);
		}else if (needpay > 55000 && needpay <= 80000) {
			pay = (int) ((needpay - 55000) * 0.35+13745);
		}else if (needpay > 80000) {
			pay = (int) ((needpay - 80000) * 0.45+22495);
		}

		System.out.println("所需要交纳的税费：" + pay);
	}
}
