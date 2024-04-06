package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問1
		// 【概要】ログイン時の入力チェックシステム処理
		// コンソールにユーザー名を入力する処理
		
		// キーボードから入力を受けるためのscanner
		Scanner scanner = new Scanner(System.in);
		
		// 入力値を受け取る変数nameを宣言
		String name = scanner.nextLine();
		
		// 問２
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力	
		
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
		Matcher matcher = pattern.matcher(name);
		
		if(!(matcher.find())) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		}
		
		
		// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
		name = scanner.nextLine();
		if(name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		}
		
		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
		name = scanner.nextLine();
		if(name == null || name.isEmpty()) {
			System.out.println("「名前を入力してください」");
		}
		
		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力
		name = scanner.nextLine();
		
		if(!(name.length() > 10) && !(name == null || name.isEmpty())) {
			System.out.println("ユーザー名「" + name + "」を登録しました");
		}
		
		
		// 問３
		// じゃんけんのシステム
		// ユーザー名が正常な値だった場合じゃんけんが起動する処理
		matcher = pattern.matcher(name);
		
		if(matcher.find() && !(name.length() > 10) && !(name == null || name.isEmpty())) {
			
			// ユーザーのじゃんけんの手を受け取る変数playerHandsを宣言
			int playerHands;
			// 相手のじゃんけんの手を受け取る変数pcHandsを宣言
			int pcHands;
		
			// じゃんけんの回数をカウントする変数を宣言
			int countPlay = 0;
		
			// じゃんけんのシステム
			do {
			
				// ユーザーの手の読み取り
				playerHands = scanner.nextInt();
			
				// ユーザーの手の入力チェック
				while( playerHands < 0 || playerHands > 2) {
					playerHands = scanner.nextInt();
				}
			
				// 相手の手の準備
				Random rand = new Random();
				pcHands = rand.nextInt(3);
			
				// 自分が「グー」・相手が「チョキ」の場合
				if(playerHands == 0 && pcHands == 1) {
				System.out.println(name + "の手は「グー」");
				System.out.println("相手の手は「チョキ」");
				System.out.println("");
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("");
				}
			
				// 自分が「チョキ」・相手が「パー」の場合
				if(playerHands == 1 && pcHands == 2) {
					System.out.println(name + "の手は「チョキ」");
					System.out.println("相手の手は「パー」");
					System.out.println("");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("");
				}
				
				// 自分が「パー」・相手が「グー」の場合
				if(playerHands == 2 && pcHands == 0) {
					System.out.println(name + "の手は「パー」");
					System.out.println("相手の手は「グー」");
					System.out.println("");
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("");
				}
				
				// じゃんけんでグーに負けた場合
				if(playerHands == 1 && pcHands == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！");
					System.out.println("ネバーギブアップ！");
					System.out.println("");
				}
			
				// じゃんけんでチョキに負けた場合
				if(playerHands == 2 && pcHands == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？");
					System.out.println("それやったら次も、俺が勝ちますよ");
					System.out.println("");
				}
			
				// じゃんけんでパーに負けた場合
				if(playerHands == 0 && pcHands == 2) {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。");
					System.out.println("そしたら何かが見えてくるはずです");
					System.out.println("");
				}
			
				// あいこの場合
				if(playerHands == pcHands) {
					System.out.println("DRAW  あいこ もう一回しましょう！");
					System.out.println("");
				}
			
				// じゃんけんを行なった回数を1回増やす
				countPlay ++;
		 	
			// 勝つまで繰り返す
			} while( (playerHands == 0 && pcHands == 2) || (playerHands == 1 && pcHands == 0) || (playerHands == 2 && pcHands == 1) || (playerHands == pcHands));
		
			// 勝つまでにかかったじゃんけん回数の表示
			System.out.println("勝つまでにかかった合計回数は" + countPlay +"回です");
		}
		
		scanner.close();
		
	}

}
