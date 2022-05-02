package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String args[]) {

		// 練習問題1
		final double TAX = 0.1;

		// 練習問題2
		int x = 480;
		double price = x + (x * TAX);
		System.out.println(price);

		// 練習問題3
		String name = "内山湧斗";
		System.out.println(name);

		// 練習問題4
		String nedan = "この商品の値段は";
		String enn = "円です";
		String goukei = nedan + price + enn;

		System.out.println(goukei);

	}

}
