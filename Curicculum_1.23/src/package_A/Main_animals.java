package package_A;

import java.util.Optional;

import package_B.Process_animals;

public class Main_animals {

	public static void main(String[] args) {
		
		Process_animals process1 = new Process_animals("ライオン",2.1,80);
		
		// null判定処理
		Optional<String> value1 = Optional.ofNullable(process1.getName());
		
		// 値がnullでないときにコンソール出力する処理
		if (value1.isPresent()) {
			System.out.println("動物名：" + process1.getName());
		}
		
		
		System.out.println("体長：" + process1.getHeight() + "m");
		
		System.out.println("速度：" + process1.getSpeed() + "km/h");
	}

}
