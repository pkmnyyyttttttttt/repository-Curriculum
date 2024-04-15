package curriculum_New_question;

import java.util.Random;


public class Curriculum_New_1_18{
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	
	public static void Q1(String h, int i) {		// 引数String型・int型指定
		// 引数に文字列型と整数型をいれてコンソール出力する処理
		System.out.println(h + " " + i);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	
	public static void Q2(int number1, int number2) {
		System.out.println(number1 * number2);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	
	public static void Q3(int[] arrays1) {
		// 拡張for文を用いてループ処理
		for(int array: arrays1) {
	
			System.out.println(array);
		}
		
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		
	public static void Q2(double number1, double number2) {
		System.out.println(number1 + number2);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	public static int[] Q5(int array2) {
		
		// 1～100までのランダムな数を格納する配列arrays2を宣言
		int[] arrays2 = new int[array2];
		
		Random random = new Random();
		
		for (int i = 0; i < array2; i++) {
			
			// 1～100までのランダムな数を格納
			arrays2[i] = random.nextInt(100) + 1;
			
			// 格納した値を順番にコンソールで出力
			System.out.println(arrays2[i]);
			
		}
		
		// 格納した値を返す処理
		return arrays2;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	public static double Q6(int[] arrays3) {
		
		// 受け取った配列の要素の平均値を受け取るaverageNumを宣言
		double averageNum = 0;
		
		// 拡張for文を用いてループ処理
		for(int array3 : arrays3) {
			
			averageNum += array3;
		}
		
		// 受け取った配列の要素の平均値を算出
		averageNum /= arrays3.length;
		
		// 受け取った配列の要素の平均値を出力
		System.out.println(averageNum);
		
		// 平均値を返す処理
        return averageNum;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean Q7(double returnNum) {
		
		// 条件演算子を用いて判定処理
		return returnNum >= 50 ? true : false;
		
	}
	
	
	
	public static void main(String[] args) {
		
    // 作成したメソッドをここで呼び出してください
		// Q1
		Q1("Hello JavaSE", 11);
		
		// Q2 ※値は指定なし
		Q2(5,10);
		
		// Q3 ※値は指定なし
		int[] arrays1 = {1,2,3,4,5,6,};
		
		Q3(arrays1);
		
		// Q4 ※値は指定なし
		Q2(1.5,2.4);
		
		// Q5・Q6・Q7 ※値は指定なし
		int[] arrays2 = Q5(10);
		
		double averageNum = Q6(arrays2);
		
		System.out.println(Q7(averageNum));
	}
}