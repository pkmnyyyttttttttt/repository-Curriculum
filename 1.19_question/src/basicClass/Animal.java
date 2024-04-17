package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog(5);
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		System.out.println(dog.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		System.out.println(dog.counts);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在も日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		
		// 表示形式を「yyyy-MM-dd H:m:s」形式に指定
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowDate = dft.format(nowDate);
		System.out.println(formatNowDate);
	}
}
