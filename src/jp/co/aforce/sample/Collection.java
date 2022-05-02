package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
	public static void main(String args[]) {

		// コレクション
		// <リスト>
		//		ArrayList<String> names;
		//		names = new ArrayList<String>();
		//		ArrayList<String> names = new ArrayList<>();
		//
		//		HashMap<String, String> employees = new HashMap<>();

		//--------------------------------------------------------

		// <要素の追加>
		//		ArrayList<String> fruits = new ArrayList<>();
		//
		//		fruits.add("りんご");
		//		fruits.add("みかん");
		//		System.out.println(fruits);
		//
		//		// <指定した位置に要素の追加>
		//		fruits.add(1, "ぶどう");
		//		System.out.println(fruits);
		//
		//		// <要素の削除>
		//		fruits.remove(0);
		//		System.out.println(fruits);
		//
		//		// <指定した要素の削除>
		//		fruits.remove("ぶどう");
		//		System.out.println(fruits);
		//
		//		// <要素の参照>
		//		fruits.add(0, "りんご");
		//		fruits.add(1, "ぶどう");
		//		System.out.println(fruits);
		//
		//		String fruit = fruits.get(1);
		//		System.out.println(fruit);
		//		System.out.println(fruits);
		//
		//		// <要素の変更>
		//		fruits.set(1, "メロン");
		//		System.out.println(fruits);

		//--------------------------------------------------------

		// <練習問題1>
		ArrayList<String> colors = new ArrayList<>();

		colors.add("赤");
		colors.add("青");
		colors.add("黄色");
		colors.add("オレンジ");
		colors.add("緑");
		colors.add("ピンク");
		colors.add("紫");

		System.out.println(colors.get(5));

		colors.remove(1);
		colors.add(2, "水色");
		System.out.println(colors.get(1));

		colors.set(6, "白");
		colors.add(0, "黒");
		System.out.println(colors.get(6));

		//--------------------------------------------------------

		// <セット>
		// <要素の追加>
		//		HashSet<String> fruits = new HashSet<>();
		//
		//		fruits.add("りんご");
		//		fruits.add("みかん");
		//		System.out.println(fruits);// セットには順番がないので位置を指定して追加できない
		//
		// <要素の削除>
		//		fruits.add("ぶどう");
		//		System.out.println(fruits);
		//
		//		fruits.remove("ぶどう");
		//		System.out.println(fruits);

		//--------------------------------------------------------

		// <練習問題2>
		HashSet<String> tales = new HashSet<>();

		tales.add("桃太郎");
		tales.add("サル");
		tales.add("犬");
		tales.add("キジ");
		tales.add("犬");
		tales.add("きびだんご");
		tales.add("きびだんご");

		System.out.println(tales);

		//--------------------------------------------------------

		// <マップ>
		// <要素の追加>
		//		HashMap<String, String> members = new HashMap<>();
		//
		//		members.put("naka@s.jp", "中垣健志");
		//		members.put("haya@s.jp", "林満也");
		//
		//		System.out.println(members);
		//
		//		// <存在しているキーによる要素の追加>
		//		String oldMember = members.put("naka@s.jp", "中原中也");
		//
		//		System.out.println(members);
		//
		//		// <要素の削除>
		//		members.remove("haya@s.jp");
		//		System.out.println(members);
		//
		//		// <要素の取得>
		//		members.put("haya@s.jp", "林満也");
		//
		//		String member = members.get("haya@s.jp");
		//		System.out.println(member);
		//		System.out.println(members);

		//--------------------------------------------------------

		// <練習問題3>

		HashMap<String, String> members = new HashMap<>();

		members.put("A001", "田中太郎");
		members.put("A002", "佐藤次郎");
		members.put("A003", "山田花子");
		members.put("A004", "佐藤次郎");

		System.out.println(members);

		members.remove("A003");
		members.put("A004", "高橋三郎");

		System.out.println(members);

		//--------------------------------------------------------

		// <配列>
		//		String[] fruits = new String[100];
		//
		//		String[] singo = {"赤", "黄", "青"};

		// <要素の取得と変更>
//		String[] fruits = new String[5];
//
//		fruits[0] = "りんご";
//
//		String fruitName = fruits[0];
//
//		System.out.println(fruitName);
//		System.out.println(fruits[1]);

		//--------------------------------------------------------

		// <練習問題4>

		int[] numbers = {1,2,3,4,5};
		System.out.println(numbers[4]);

	}
}
