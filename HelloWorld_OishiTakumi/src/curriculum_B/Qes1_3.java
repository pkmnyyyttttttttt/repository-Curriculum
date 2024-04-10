package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問1
		// 【概要】ログイン時の入力チェックシステム処理
		// コンソールにユーザー名を入力する処理
		
		// キーボードから入力を受けるためのscanner
		Scanner scanner = new Scanner(System.in);
		// ユーザー名を受け取る変数nameを宣言
		String name = scanner.nextLine();
		// 正規表現のパターンを作成
		Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+$");
				
				
				
		// ユーザー名が正常に登録されるまで繰り返し名前を入力する処理
		do {
					
			// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
			if(name.length() > 10) {
				System.out.println("「名前を10文字以内にしてください」");
				name = scanner.nextLine();
			}
					
			// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
			if(name == null || name.isEmpty()) {
				System.out.println("「名前を入力してください」");
				name = scanner.nextLine();
			}
					
			// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力	
			if(!(pattern.matcher(name).find())) {
				System.out.println("「半角英数字のみで名前を入力してください」");
				name = scanner.nextLine();
			}
			
		} while ((name.length() > 10) || (name == null || name.isEmpty()) || !(pattern.matcher(name).find()));
				
				
		System.out.println("ユーザー名「" + name + "」を登録しました");
				
				
		// ユーザー名が正常に登録された場合にじゃんけんのシステムが起動
		if (!(name.length() > 10) && !(name == null || name.isEmpty()) && (pattern.matcher(name).find())) {
			
			// ユーザーの手を受ける変数playerHandsを宣言
			int playerHands;
			
			// 相手のじゃんけんの手を受け取る変数pcHandsを宣言
			Random rand = new Random();
			int pcHands;
					
			// じゃんけんの回数をカウントする変数を宣言
			int countPlay = 0;
			
			
			// じゃんけんのシステム
			// 勝つまで繰り返す
			do {
				
				// じゃんけんを行なった回数を1回増やす
				countPlay ++;
				
				// ユーザーの手を受け取る
				playerHands = scanner.nextInt();
				
				// 相手の手を0～2の中からランダムで決定
				pcHands = rand.nextInt(3);
				
				
				// 自分が「グー」・相手が「チョキ」の場合
				if(playerHands == 0 && pcHands == 1) {
					System.out.println(name + "の手は「グー」");
					System.out.println("相手の手は「チョキ」");
					System.out.println("");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("");
					// 勝つまでにかかったじゃんけん回数の表示
					System.out.println("勝つまでにかかった合計回数は" + countPlay +"回です");
				}
				
				// 自分が「チョキ」・相手が「パー」の場合
				if(playerHands == 1 && pcHands == 2) {
					System.out.println(name + "の手は「チョキ」");
					System.out.println("相手の手は「パー」");
					System.out.println("");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("");
					// 勝つまでにかかったじゃんけん回数の表示
					System.out.println("勝つまでにかかった合計回数は" + countPlay +"回です");
				}
				
				// 自分が「パー」・相手が「グー」の場合
				if(playerHands == 2 && pcHands == 0) {
					System.out.println(name + "の手は「パー」");
					System.out.println("相手の手は「グー」");
					System.out.println("");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("");
					// 勝つまでにかかったじゃんけん回数の表示
					System.out.println("勝つまでにかかった合計回数は" + countPlay +"回です");
				}
				
				// じゃんけんでグーに負けた場合
				if(playerHands == 1 && pcHands == 0) {
					System.out.println(name + "の手は「チョキ」");
					System.out.println("相手の手は「グー」");
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
					System.out.println("");
				
				}
				
				// じゃんけんでチョキに負けた場合
				if(playerHands == 2 && pcHands == 1) {
					System.out.println(name + "の手は「パー」");
					System.out.println("相手の手は「チョキ」");
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
					System.out.println("");
				
				}
				
				// じゃんけんでパーに負けた場合
				if(playerHands == 0 && pcHands == 2) {
					System.out.println(name + "の手は「グー」");
					System.out.println("相手の手は「パー」");
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
					System.out.println("");
				
				}
				
				// グーであいこの場合
				if(playerHands == 0 && pcHands == 0) {
					System.out.println(name + "の手は「グー」");
					System.out.println("相手の手は「グー」");
					System.out.println("DRAW あいこ もう一回しましょう！");
					System.out.println("");
				
				}
				// チョキであいこの場合
				if(playerHands == 1 && pcHands == 1) {
					System.out.println(name + "の手は「チョキ」");
					System.out.println("相手の手は「チョキ」");
					System.out.println("DRAW あいこ もう一回しましょう！");
					System.out.println("");
				
				}
				
				// パーであいこの場合
				if(playerHands == 2 && pcHands == 2) {
					System.out.println(name + "の手は「パー」");
					System.out.println("相手の手は「パー」");
					System.out.println("DRAW あいこ もう一回しましょう！");
					System.out.println("");
				
				}
				
				
			} while( (playerHands == 0 && pcHands == 2) || (playerHands == 1 && pcHands == 0) || (playerHands == 2 && pcHands == 1) || (playerHands == pcHands));
			
		}
			
		
		scanner.close();
	}

}
