package curriculum_B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問７
		// N人の生徒の成績を管理するプログラム
		/* 
		 * 各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力
		 * プログラムの実行は必ず1回以上行われる
		 */
		
		// キーボードから入力を受けるためのscanner
		Scanner scanner = new Scanner(System.in);
				
				
				
		// テストの教科を受け取る配列を宣言
		String[] subjects = {"英語","数学","理科","社会"};
				
		// 生徒の人数を受け取る変数numberStudentsを宣言
		int numberStudents;
				
		// 生徒の人数の入力を要求する処理
		System.out.print("生徒の人数を入力してください（2以上）: ");
		numberStudents = scanner.nextInt();
				
	
				
		// 生徒の人数が2人以上の時にシステムが起動
		if(numberStudents >= 2) {
					
					
			// 英語の合計点数を受け取る変数を宣言
			int sumEnglish = 0;
			// 数学の合計点数を受け取る変数を宣言
			int sumMath = 0;
			// 理科の合計点数を受け取る変数を宣言
			int sumScience = 0;
			// 社会の合計点数を受け取る変数を宣言
			int sumSociety = 0;
					
					
					
			// 全体点数合計を受け取る変数を宣言
			int scoreTotal = 0;
			// 個人平均を受け取る変数を宣言
			double averagePersonal;	
			// 全体平均を受け取る変数を宣言
			double averageTotal;
			// 英語平均を受け取る変数を宣言
			double averageEnglish;
			// 数学平均を受け取る変数を宣言
			double averageMath;
			// 理科平均を受け取る変数を宣言
			double averageScience;
			// 社会平均を受け取る変数を宣言
			double averageSciety;
						
					
			// 各生徒の4教科合計点数を受け取るList:scoreListを宣言
			List<Integer> scoreList = new ArrayList<>();
			
			
			// ループ回数の変数countを宣言
			int count = 0; 
			
			
			// 生徒の人数分繰り返し処理
			do {
						
				// 英語の点数を受ける変数scoreEnglishを宣言
				int scoreEnglish = 0;
				// 数学の点数を受ける変数scoreMathを宣言
				int scoreMath = 0;
				// 理科の点数を受ける変数scoreScienceを宣言
				int scoreScience = 0;
				// 社会の点数を受ける変数scoreScietyを宣言
				int scoreSciety = 0;
				// 個人点数合計
				int sumPersonal = 0;
						
				// 英語の点数の入力を要求する処理
				System.out.print(count+1 + "人目の『" + subjects[0] + "』の点数を入力してください : ");
				scoreEnglish = scanner.nextInt();
				
				// 数学の点数の入力を要求する処理	
				System.out.print(count+1 + "人目の『" + subjects[1] + "』の点数を入力してください : ");
				scoreMath = scanner.nextInt();
				
				// 理科の点数の入力を要求する処理	
				System.out.print(count+1 + "人目の『" + subjects[2] + "』の点数を入力してください : ");
				scoreScience = scanner.nextInt();
				
				// 社会の点数の入力を要求する処理	
				System.out.print(count+1 + "人目の『" + subjects[3] + "』の点数を入力してください : ");
				scoreSciety = scanner.nextInt();
				
				// 改行
				System.out.println("");
				
				
				// 英語合計点数加算処理
				sumEnglish += scoreEnglish;
				
				// 数学合計点数加算処理
				sumMath += scoreMath;
				
				// 理科合計点数加算処理
				sumScience += scoreScience;
				
				// 社会合計点数加算処理
				sumSociety += scoreSciety;
				
				// 個人点数の合計点加算処理
				sumPersonal += scoreEnglish + scoreMath + scoreScience + scoreSciety;
				
				// 全体の合計点加算処理
				scoreTotal += scoreEnglish + scoreMath + scoreScience + scoreSciety;
				
				
				// 個人点数の合計点をscoreListへ追加する処理
				scoreList.add(sumPersonal);
				
				count++;
				
			}while(count < numberStudents);
			
			
			// 生徒の人数分平均点を表示する処理
			 for(int i = 0; i < scoreList.size(); i++) {
				 
				 // 個人平均点の算出
				 averagePersonal = scoreList.get(i) / 4;
				 // 個人の平均点を表示する処理
				 System.out.println(i+1 + "人目の平均点は" + String.format("%.2f", averagePersonal) + "点です。");
			
			 }
			
			
			// 英語の平均点の算出
			averageEnglish = sumEnglish / numberStudents;
			
			// 数学の平均点の算出
			averageMath = sumMath / numberStudents;
			
			// 理科の平均点の算出
			averageScience = sumScience / numberStudents;
			
			// 社会の平均点の算出
			averageSciety = sumSociety / numberStudents;
			
			// 全体の平均点の算出
			averageTotal = scoreTotal / (4 * numberStudents);
			
			
			// 改行
			System.out.println("");
			
			// 英語の平均点を表示する処理
			System.out.println(subjects[0] +"の平均点は" + String.format("%.2f", averageEnglish) + "点です。");
			
			// 数学の平均点を表示する処理
			System.out.println(subjects[1] +"の平均点は" + String.format("%.2f", averageMath) + "点です。");
			
			// 理科の平均点を表示する処理
			System.out.println(subjects[2] +"の平均点は" + String.format("%.2f", averageScience) + "点です。");
			// 社会の平均点を表示する処理
			
			System.out.println(subjects[3] +"の平均点は" + String.format("%.2f", averageSciety) + "点です。");
			
			// 全体の平均点を表示する処理
			System.out.println("全体の平均点は" + String.format("%.2f", averageTotal) + "点です。");
					
		}
			scanner.close();

	}

}
