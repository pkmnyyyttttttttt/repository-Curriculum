package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問６
		
		// キーボードから入力を受けるためのscanner
		Scanner scanner = new Scanner(System.in);
		
		// 入力値の受け取り
		String product = scanner.nextLine();
		
		// 受け取った値を"、"で区切り配列に分配
		String[] products = product.split("、");
		
		// Randomクラスのインスタンスの作成
		Random rand = new Random();
		
		// パソコンの在庫数を受け取る変数countsPcを宣言
		int countsPc;
		
		// 冷蔵庫の在庫数を受け取る変数countsFridgeを宣言
		int countsFridge;
		
		// 扇風機の在庫数を受け取る変数countsFanを宣言
		int countsFan;
		
		// 洗濯機の在庫数を受け取る変数countsWashを宣言
		int countsWash;
		
		// 加湿器の在庫数を受け取る変数countsHumidifierを宣言
		int countsHumidifier;
		
		// テレビの在庫数を受け取る変数countsTvを宣言
		int countsTv;
		
		// ディスプレイの在庫数を受け取る変数countsTvを宣言
		int countsDisplay;
		
		
		// 受け取った値を繰り返し処理を行い入力した商品の残り台数を出力する処理
		for(String pro :products) {
			
			switch(pro) {
			
				// パソコンを入力した場合の処理
				case "パソコン":
					countsPc = rand.nextInt(12);
					System.out.println("パソコンの残り台数は" + countsPc + "台です");
					break;
			
				// 冷蔵庫を入力した場合の処理
				case "冷蔵庫":
					countsFridge = rand.nextInt(12);
					System.out.println("冷蔵庫の残り台数は" + countsFridge + "台です");
					break;
			
				// 扇風機を入力した場合の処理
				case "扇風機":
					countsFan = rand.nextInt(12);
					System.out.println("扇風機の残り台数は" + countsFan + "台です");
					break;
					
				// 洗濯機を入力した場合の処理
				case "洗濯機":
					countsWash = rand.nextInt(12);
					System.out.println("洗濯機の残り台数は" + countsWash + "台です");
					break;
				
				// 加湿器を入力した場合の処理
				case "加湿器":
					countsHumidifier = rand.nextInt(12);
					System.out.println("加湿器の残り台数は" + countsHumidifier + "台です");
					break;
				
				// テレビを入力した場合の処理
				case "テレビ":
					countsTv = rand.nextInt(12);
					System.out.println("テレビの残り台数は" + countsTv + "台です");
					System.out.println("");
					
					// 同時にディスプレイが入力されていた場合にディスプレイの在庫数を表示する処理
					if(product.contains("ディスプレイ")) {
						countsDisplay = 11-countsTv;
						System.out.println("ディスプレイの残り台数は" + countsDisplay + "台です");
					}
					break;
				
				// ディスプレイを入力した場合の処理
				case "ディスプレイ":
					//  同時にテレビが入力されていない場合にディスプレイの在庫数を表示する処理
					if(!(product.contains("テレビ"))) {
						countsTv = rand.nextInt(12);
						countsDisplay = 11-countsTv;
						System.out.println("ディスプレイの残り台数は" + countsDisplay + "台です");
					}
					break;
					
				// そのほかの値が入力された場合の出力
				default:
					System.out.println("『" + pro +"』は指定の商品ではありません");
			}
			// 1行空ける処理
			System.out.println("");
		}
		
		scanner.close();
	}

}
