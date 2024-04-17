package package_A;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import package_B.Process;



public class Main {

	public static void main(String[] args) {
		
		Process process1 = new Process("日本" ,"寿司" ,"和食");
		
		// null判定処理
		Optional<String> value1 = Optional.ofNullable(process1.country);
		Optional<String> value2 = Optional.ofNullable(process1.food);
		Optional<String> value3 = Optional.ofNullable(process1.foodCategory);
		
		
		// null出ないときにコンソール出力する処理
		if (value1.isPresent()) {
			System.out.println("こんにちは！ここは" + process1.country + "です！");
		}
		
		if(value2.isPresent()) {
			System.out.println("この" + process1.food + "はうまい");
		}
		
		if(value3.isPresent()) {
			System.out.println(process1.food + "は" + process1.foodCategory + "です");
		}
		
		
		// 現在の日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		
		// 表示形式を「yyyy/MM/dd H:m:s」形式に指定
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formatNowDate = dft.format(nowDate);
		// 現在の日時をコンソール出力
		System.out.println("今の現在日時は" + formatNowDate + "です");
		
	}

}
