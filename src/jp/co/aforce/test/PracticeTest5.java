package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題1
		Random random = new Random();
		int fortune = random.nextInt(4);
		System.out.println("fortune = " + fortune);
		switch (fortune) {
			case 1:
				System.out.println("吉です");
				break;
			case 2:
				System.out.println("中吉です");
				break;
			case 3:
				System.out.println("大吉です");
				break;
			default:
				System.out.println("凶です");
				break;
		}

		//練習問題2
		int amount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				amount += i;
			}
		}
		System.out.println("7の倍数の総合計は" + amount);

		//練習問題3
		for (int j = 1; j <= 9; j++) {
			for (int k = 1;k <= 9;k++) {
				int m = j*k;
				System.out.print(" ");
				if(m < 10) {
					System.out.print(" ");
				}
				System.out.print(m);
			}
			System.out.println();
		}


	}

}
