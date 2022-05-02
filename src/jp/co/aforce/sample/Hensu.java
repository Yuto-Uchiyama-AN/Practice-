package jp.co.aforce.sample;

public class Hensu {

	public static void main(String args[]) {

		// 練習問題1
		int value = 100;

		value += 10;

		--value;

		System.out.println(value);

		// パターン1
		int x = 3;
		int y = x++; //代入が先
		System.out.println(x);
		System.out.println(y);

		// パターン2
		int a = 3;
		int b = ++a; //+1が先
		System.out.println(a);
		System.out.println(b);

		//--------------------------------------------------------

		// 練習問題2
		String lastName = "内山";
		String firstName = "湧斗";
		String myName = lastName + firstName;

		System.out.println(myName);

		// パターン1
		System.out.println("内山湧斗");
		//console.log('内山湧斗')

		//--------------------------------------------------------

		// 練習問題3
		String saying = "明日は明日の風が吹く";
		boolean result = saying.contains("風");
		boolean result1 = saying.contains("雨");
		boolean result2 = saying.contains("晴");

		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);

		// パターン1
		String badHaiku = "振る池や 蛙飛び込む 水の音";
		String goodHaiku = badHaiku.replace("振る", "古");
		System.out.println(goodHaiku);
		System.out.println(badHaiku);

		// パターン2
		badHaiku.length();

		String haiku = "ふるいけやかわずとびこむみずのおと";
		String middle = haiku.substring(5, 12);
		System.out.println(middle);

		// パターン3
		System.out.println("かえる\nぴょこぴょこ\tみぴょこぴょこ");

		//--------------------------------------------------------



	}

}
