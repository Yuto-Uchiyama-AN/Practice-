package jp.co.aforce.practice;

public class PracticeTest5 {
	public static void main(String args[]) {
		// 練習問題2
		String[] animals = { "犬", "猫", "うさぎ", "へび" };

		// 練習問題3
		String favo = "猫";
		String call = "";
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equals(favo)) {
				call = "はリストに含まれています";
				break;
			} else {
				call = "はリストに含まれていません";
			}
		}
		System.out.println(favo + call);


		// 練習問題4
		int born = 1;
		switch (born) {
		case 1:
			System.out.println("1月,元日,成人の日");
			break;
		case 2:
			System.out.println("2月,建国記念日の日,天皇誕生日");
			break;
		case 3:
			System.out.println("3月,春分の日");
			break;
		case 4:
			System.out.println("4月,昭和の日");
			break;
		case 5:
			System.out.println("5月,憲法記念日,みどりの日,こどもの日");
			break;
		case 6:
			System.out.println("6月,なし");
			break;
		case 7:
			System.out.println("7月,海の日,スポーツの日");
			break;
		case 8:
			System.out.println("8月,山の日");
			break;
		case 9:
			System.out.println("9月,敬老の日,秋分の日");
			break;
		case 10:
			System.out.println("10月,なし");
			break;
		case 11:
			System.out.println("11月,文化の日,勤労感謝の日");
			break;
		case 12:
			System.out.println("12月,なし");
			break;

		}

	}

}
