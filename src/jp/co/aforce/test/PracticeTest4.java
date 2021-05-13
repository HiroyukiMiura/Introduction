package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest4 {

	public static void main(String[] args) {
		//練習問題1
		//②が適切
		//サンプルコードでは、str1もstr2もどちらも「abc」という文字列になる。
		//「==」は、数値同士が等しいかを評価する比較演算子なので、①では、「abc = ab + c」が正しいかどうかを評価してしまう。
		//したがって、「==」では文字列の比較を適切に行うことができないので、「equals」でコーディングするべきである。

		//練習問題2
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		//練習問題3
		String wolf = "狼";
		if(Arrays.asList(animals).contains("狼")) {
			System.out.println(wolf+"はリストに含まれています");
		} else {
			System.out.println(wolf+"はリストに含まれていません");
		}

		//練習問題4
		int birthMonth = 10;
		String holiday;
		switch(birthMonth) {
		case 1:
			holiday = "元日,成人の日";
			break;
		case 2:
			holiday = "建国記念の日,天皇誕生日";
			break;
		case 3:
			holiday = "春分の日";
			break;
		case 4:
			holiday = "昭和の日";
			break;
		case 5:
			holiday = "憲法記念日,みどりの日,こどもの日";
			break;
		case 6:
			holiday = "なし";
			break;
		case 7:
			holiday = "海の日,スポーツの日";
			break;
		case 8:
			holiday = "山の日";
			break;
		case 9:
			holiday = "敬老の日,秋分の日";
			break;
		case 10:
			holiday = "なし";
			break;
		case 11:
			holiday = "文化の日,勤労感謝の日";
			break;
		default:
			holiday = "なし";
			break;
		}
		System.out.println(holiday);

		//if文の場合、値が1かどうか、値が2かどうか、値が3かどうか…などといちいち処理する必要があるが、
		//switch文の場合、値に応じて処理を分岐するので、実行するべき処理が少なくなるから。


	}

}
