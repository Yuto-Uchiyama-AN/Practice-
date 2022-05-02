package jp.co.aforce.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hensu2 {
	public static void main(String args[]) {

		// <現在の日時の取得>
		//		Calendar calendar = Calendar.getInstance();
		//		Date today = calendar.getTime();

		//		calendar.clear();
		//		calendar.set(1234, 4, 6, 7, 8, 9);
		//		Date date = calendar.getTime();
		//		System.out.println(date);

		//--------------------------------------------------------

		//		Calendar calendar = Calendar.getInstance();
		//		System.out.println(calendar.getTime()); // 現在日時(2022/4/26 10:22:00)

		// <clearメソッドがない>

		//		calendar.set(1234, 4, 6);
		//		System.out.println(calendar.getTime()); // (1234/5/6/10:22:00)

		//		calendar.clear();// クリア（設定している値を消去)
		//		calendar.set(1234, 4, 6); // 数分秒の設定は無し
		//		System.out.println(calendar.getTime()); //(1234/5/6/00:00:00)

		//--------------------------------------------------------

		//		Calendar calendar = Calendar.getInstance();
		//		calendar.clear();

		//		calendar.set(1984, 11, 26, 11, 33, 50);

		//		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		//		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		//		System.out.println(hourOfDay);
		//		System.out.println(dayOfWeek);

		//--------------------------------------------------------

		// <フィールドの変更>

		//		Calendar calendar = Calendar.getInstance();
		//		calendar.clear();
		//		calendar.set(1984, 11, 26, 11, 33, 50);

		//		System.out.println(calendar.getTime());

		//		calendar.set(Calendar.YEAR, 2018);
		//		System.out.println(calendar.getTime());

		//		calendar.set(Calendar.SECOND, 00);
		//		System.out.println(calendar.getTime());

		//--------------------------------------------------------

		// <日付の計算>

		//		Calendar calendar = Calendar.getInstance();
		//		System.out.println(calendar.getTime());
		//
		//		calendar.add(Calendar.DAY_OF_MONTH, 3);
		//		System.out.println(calendar.getTime());
		//
		//		calendar.add(Calendar.MONTH, -6);
		//		System.out.println(calendar.getTime());

		//--------------------------------------------------------

		// <日付を文字列に>

		//		Calendar calendar = Calendar.getInstance();
		//
		//		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//
		//		String formattedDate = format.format(calendar.getTime());
		//		System.out.println(formattedDate);

		//--------------------------------------------------------

		// <練習問題4>

		Calendar calendar = Calendar.getInstance();

		Date today = calendar.getTime();
		System.out.println(today);

		calendar.set(2000, 12, 17);
		Date born = calendar.getTime();
		System.out.println(born);

		// <練習問題5>
		calendar.clear();
		calendar.set(2020, 0, 2, 10, 20, 30);
		Date date = calendar.getTime();
		System.out.println(date);

		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);

		// <練習問題6>
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());

		// <練習問題7>
		calendar.clear();
		calendar.set(2000, 0, 17, 5, 15, 15);

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日(E) HH:mm:ss");
		String formattedDate = format.format(calendar.getTime());
		System.out.println(formattedDate);

		//--------------------------------------------------------

	}

}
