package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 28;
		double z = 3.14;

		//練習問題1
		System.out.println(x * y);

		//練習問題2
		System.out.println(y / x);
		System.out.println(y % x);

		//連取問題3
		double i = y * z;
		System.out.println(i);

		//練習問題4
		double j = ++i;
		System.out.println(j);

		//練習問題5
		int age = 23;
		Random random = new Random();
		int r = random.nextInt(101);

		if (age > r) {
			System.out.println("私のほうが年上です。");
		} else if (age < r) {
			System.out.println("私のほうが年下です。");
		} else {
			System.out.println("私と同い年です。");
		}
		System.out.println("r = " + r);

	}

}
