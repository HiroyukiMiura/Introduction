package jp.co.aforce.test;

public class MinMax {

	public int getMaxValue(int a, int b, int c) {
		if (a>b && a>c) {
			return a;
		} else if (b>a && b>c) {
			return b;
		} else {
			return c;
		}
	}

	public int getMinValue(int a, int b, int c) {
		if (a<b && a<c) {
			return a;
		} else if (b<a && b<c) {
			return b;
		} else {
			return c;
		}
	}


}
