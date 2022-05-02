package jp.co.aforce.practice;

public class PracticeTest6 {
	public static void main(String args[]) {
		int fortune = new java.util.Random().nextInt(4);
		// 練習問題1
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
		case 4:
			System.out.println("凶です");
			break;
		}

		// 練習問題2
		int baisu = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				baisu += i;
			}

		}
		System.out.println("7の倍数の総合計は" + baisu + "です");

		// 練習問題3
		for (int y = 1; y < 10; y++) {
			for (int x = 1; x < 10; x++) {
				System.out.printf("%2d", x * y);
			}
			System.out.println();
		}

	}

}
