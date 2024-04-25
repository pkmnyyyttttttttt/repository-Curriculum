package package_Process;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Process {
	
	
	// キーボードから入力を受けるためのscanner
	Scanner scanner = new Scanner(System.in);
	
	// フィールド変数の宣言
	private String[] numberLank;
	private String imfoPre;
	private String namePrefecture;
	private String prifectualCapital;
	private double areaPrefecture;
	private int[] intArray;
	
	// animalCategoryのゲッター
	public String[] getNumberLank() {
		return this.numberLank;
	}
	
	// namePrefectureのゲッター
	public String getNamePrefecture() {
		return this.namePrefecture;
	}
		
	// prifectualCapitalのゲッター
	public String getPrifectualCapital() {
		return this.prifectualCapital;
	}
		
	// areaPrefectureのゲッター
	public double getAreaPrefecture() {
		return this.areaPrefecture;
	}
	
	// intArrayのゲッター
	public int[] getIntArray() {
		return this.intArray;
	}
	
	// imfoPreのゲッター
	public String getImfoPre() {
		return this.imfoPre;
	}
	
	
	// 数字と都道府県の情報を紐付ける処理
	Map<Integer,String> exArea = new HashMap<Integer,String>() {
		{
			put(0, "北海道:札幌市:83424");
			put(1, "青森県:青森市:9646");
			put(2, "岩手県:盛岡市:15275");
			put(3, "宮城県:仙台市:7282");
			put(4, "秋田県:秋田市:11638");
			put(5, "山形県:山形市:9323");
			put(6, "福島県:福島市:13784");
			put(7, "茨城県:水戸市:6097");
			put(8, "栃木県:宇都宮市:6408");
			put(9, "群馬県:前橋市:6362");
			put(10, "埼玉県:さいたま市:3798");
			
			
		}
	};
	
	
	public Process() {
		
		// キーボードから入力を受けとる処理
		// 受け取った値を "," で区切り配列に分配する処理
		System.out.println("コンソールに文字を入力してください");
		this.numberLank = scanner.nextLine().split(",");
		
	}
	
	
	public void storeArray() {
		
		// 配列をString型からint型に変換する処理
		this.intArray = Stream.of(numberLank).mapToInt(Integer::parseInt).toArray();
		
		// 配列の値を昇順に並び替える処理
		Arrays.sort(getIntArray());
		
		
		for (int i = 0; i < this.intArray.length; i++) {
			
			// 紐付けられている都道府県の情報を":"で区切り配列に分配する処理
			this.imfoPre = exArea.get(this.intArray[i]);
			String[] value1 = getImfoPre().split(":");
			
			
			
			for (int j = 0; j < value1.length; j++) {
				
				// 配列に分配した値を各変数に代入する処理
				this.namePrefecture = value1[j++];
				this.prifectualCapital = value1[j++];
				this.areaPrefecture = Double.parseDouble(value1[j++]);
						
				// displayPrefecturesメソッドの呼び出し
				displayPrefectures();
				
			}
			
		}
	}
	
	
	// 都道府県名・県庁所在地・面積を表示する処理
	public void displayPrefectures() {
		
		
		System.out.println("都道府県名：" + getNamePrefecture());
		System.out.println("県庁所在地：" + getPrifectualCapital());
		System.out.println("面積：" + getAreaPrefecture() + "km2");
		System.out.println("");
		
	}
}
