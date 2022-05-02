package jp.co.aforce.sample;

import java.util.Calendar;

public class Sura7 {
	public static void main(String args[]) {

		// 制御構文

		// <分岐>if
		//		int x = 10;
		//
		//		if (x < 100) {
		//			System.out.println("条件に一致したので");
		//			System.out.println("処理を実行します。");
		//			}
		//--------------------------------------------------------

		//		int x = 100;
		//
		//		if (x < 100) {
		//			System.out.println("xは100より小さい");
		//		} else {
		//			System.out.println("xは100より大きい");
		//		}
		//--------------------------------------------------------

		//		int x = 200;
		//
		//		if (x < 100) {
		//			System.out.println("xは100より小さい");
		//		} else if (x < 200) {
		//			System.out.println("xは200より小さい");
		//		} else {
		//			System.out.println("xは200より大きい");
		//		}
		//--------------------------------------------------------

		// <練習問題6>

		int value = 10;

		if (value == 0) {
			System.out.println("値は0です");
		} else if (value >= 1 && value <= 5) {
			System.out.println("値は1以上5以下です");
		} else {
			System.out.println("値は" + value + "です");
		}
		//--------------------------------------------------------

		// <分岐>switch

		//		int x = 1;
		//
		//		switch (x) {
		//		case 1:
		//			System.out.println("xの値は1です");
		//			break;
		//		case 2:
		//			System.out.println("xの値は2です");
		//			break;
		//		default:
		//			System.out.println("xの値は1，2以外の値です");
		//			break;

		//		}
		//--------------------------------------------------------

		// <練習問題7>

		Calendar calendar = Calendar.getInstance();
		String dayOfWeek;

		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dayOfWeek = "日";
			break;
		case 2:
			dayOfWeek = "月";
			break;
		case 3:
			dayOfWeek = "火";
			break;
		case 4:
			dayOfWeek = "水";
			break;
		case 5:
			dayOfWeek = "木";
			break;
		case 6:
			dayOfWeek = "金";
			break;
		default:
			dayOfWeek = "土";
			break;
		}
		System.out.println("今日は" + dayOfWeek + "曜日です。");

		//--------------------------------------------------------

		// <反復>while

		//		int x = 1;
		//		int amount = 0;
		//
		//		while (amount < 10) {
		//			System.out.println(x + "を足します");
		//			amount = amount + x;
		//			x++;
		//		}
		//		System.out.println("合計は" + amount);

		//--------------------------------------------------------

		// <練習問題8>

		int number = 1;

		while (number <= 30) {
			if (number % 3 == 0) {
				System.out.println(number);
			}
			number++;
		}

		//--------------------------------------------------------

		// <反復>do-while

		//		int x = 1;
		//		int amount = 0;
		//
		//		do {
		//			System.out.println(x + "を足します");
		//			amount = amount + x;
		//			x++;
		//		} while (amount < 10);
		//		System.out.println("合計は" + amount);

		//--------------------------------------------------------

		// <練習問題9>

		int bango = 2;

		do {
			System.out.println(bango);
			bango += 2;
		} while (bango < 10);

		//--------------------------------------------------------

		// <反復>for

		//		for (int i = 3; i > 0; i--) {
		//			System.out.println(i + "秒前");
		//		}
		//		System.out.println("発射！");

		//--------------------------------------------------------

		// <練習問題10>

		for (int i = 1; i <= 10; i++) {
			System.out.println("4×" + i + "=" + (4 * i));
		}
		System.out.println("終了");

		//--------------------------------------------------------

		// <配列と組み合わせる>for

		//		String[] fruits = new String[3];
		//
		//		fruits[0] = "リンゴ";
		//		fruits[1] = "オレンジ";
		//		fruits[2] = "ブドウ";
		//
		//		for (int s = 0; s < fruits.length; s++) {
		//			System.out.println(fruits[s]);
		//		}

		//--------------------------------------------------------

		// <拡張>for

		//		HashSet<String> books = new HashSet<>();
		//		books.add("不思議の国のアリス");
		//		books.add("ヘンゼルとグレーテル");
		//		books.add("銀河鉄道の夜");
		//
		//		for (String book : books) {
		//			System.out.println(book);
		//		}

		//--------------------------------------------------------

		// <練習問題11>

		String[] nihongo = { "日", "月", "火", "水", "木", "金", "土" };
		String[] eigo = { "Sun", "Mon", "Tue", "Wes", "Thu", "Fri", "Sat" };

		for (int d = 0; d < nihongo.length; d++) {
			System.out.println(nihongo[d] + "曜日は英語では" + eigo[d] + "です");
		}

		//--------------------------------------------------------

		// <処理を抜ける>break
		//
		//		for (int m = 0; m < 5; m++) {
		//
		//			if (m == 3) {
		//				break;
		//			}
		//			System.out.println(m);
		//		}
		//		System.out.println("プログラムの終了");

		//--------------------------------------------------------

		// <練習問題12>

		int count = 0;
		while (true) {
			if (count == 5) {
				break;
			}
			count++;
		}
		System.out.println(count);

		//--------------------------------------------------------

		// <処理をスキップする>continue

		//		for (int q = 0; q < 5; q++) {
		//			if (q == 3) {
		//				continue;
		//			}
		//			System.out.println(q);
		//		}
		//		System.out.println("プログラムの終了");

		//--------------------------------------------------------

		// <練習問題13>

		for (int q = 0; q <= 10; q++) {
			if (q % 3 == 0) {
				continue;
			}
			System.out.println(q);
		}
		System.out.println("プログラムの終了");

		//--------------------------------------------------------

	}

}
