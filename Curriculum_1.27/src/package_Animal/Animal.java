package package_Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {
	
	// キーボードから入力を受けるためのscanner
	Scanner scanner = new Scanner(System.in);
	
	
	// フィールド変数の宣言
	private String animalCategory;
	private String nameAnimal;
	private double length;
	private int speed;
	private String scientificName;
	
	// animalCategoryのゲッター
	public String getAnimalCategory() {
		return this.animalCategory;
	}
	
	// nameAnimalのゲッター
	public String getNameAnimal() {
		return this.nameAnimal;
	}
	
	// lengthのゲッター
	public double getLength() {
		return this.length;
	}
	
	// speedのゲッター
	public int getSpeed() {
		return this.speed;
	}
	
	// scientificNameのゲッター
	public String getScientificName() {
		return this.scientificName;
	}
	
	// 動物名と学名を紐付ける処理
	Map<String,String> exMap = new HashMap<String,String>() {
		{
			put("ライオン","パンテラ レオ");
			put("ゾウ","ロキソドンタ・サイクロティス");
			put("パンダ","アイルロポダ・メラノレウカ");
			put("チンパンジー","パン・トゥログロディテス");
			put("シマウマ","チャップマンシマウマ");
		}
	};
	
	
	public Animal() {
		
		// キーボードから入力を受けとる処理
		System.out.println("コンソールに文字を入力してください");
		this.animalCategory = scanner.nextLine();
		
	}
	
	public void process() {
		
		// 受け取った値を "," と ":" で区切り配列に分配	
		String[] value1 = this.animalCategory.split("[,*:]");
		
		
		for (int i = 0; i < value1.length; i++) {
			// 配列に分配した値を各変数に代入する処理
			this.nameAnimal = value1[i++];
			this.length = Double.parseDouble(value1[i++]);
			this.speed = Integer.parseInt(value1[i]);
			this.scientificName = exMap.get(getNameAnimal());
			
			// displayAnimalメソッドの呼び出し
			displayAnimal();
			
			// displayScientificNameメソッドの呼び出し
			displayScientificName();
			
		}
	}
	
	
	// 動物名・体長・即度を表示する処理
	public void displayAnimal() {
		
		System.out.println("動物名：" + getNameAnimal());
		System.out.println("体長：" + getLength() + "m");
		System.out.println("速度：" + getSpeed() + "km/h");
		
	}
	
	
	
	// 学名を表示する処理
	public void displayScientificName() {
		
		// 動物名と学名が紐づけられていないものは不明と表示する処理
		if (getScientificName() == null) {
			this.scientificName = "不明";
		}
		
		System.out.println("学名：" + getScientificName());
		System.out.println("");
		
	}
	
}
