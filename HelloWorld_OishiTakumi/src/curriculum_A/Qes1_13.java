package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問１・ローカル変数の宣言
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		char cha;
		String str;
		boolean boo;
		
		// 問２・ローカル変数の初期化
		b = 0;
		s = 0;
		i = 0;
		l = 0;
		f = 0.0f;
		d = 0.0d;
		cha = '\u0000';
		str = null;
		boo = false;
		
		// 問３・初期化したローカル変数に値の代入
		b = 10;
		s = 100;
		i = 1000;
		l = 10000;
		f = 9.5F;
		d = 10.5;
		cha = 'a';
		str = "ハロー";
		boo = true;
		
		// 問４・変数を用いてコンソール出力
		// 11110を変数を用いてコンソール出力
		System.out.println(l+i+s+b);
		// 20を変数を用いてコンソール出力
		System.out.println(b+b);
		// a ハロー trueを変数を用いてコンソール出力
		System.out.println(cha + " " + str + " " + boo);
		// 11130を数字を全て足してコンソール出力
		System.out.println(l+i+s+b+f+d);
		// 10000000000を小数点以外の数字を全てかけてコンソール出力
		System.out.println(b*s*i*l);
		// 0.105を10.5割る100をしてコンソール出力
		System.out.println(d/s);
		// -90を10引く100をしてコンソール出力
		System.out.println(b-s);
		
		// 問５・課題文記載のプログラムを修正して「ハローJAVA43」と表示させる
		// 修正前の変数の宣言及びコンソール出力の処理
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		// 修正の処理
		/* String型で宣言していたnumをint型num2として再度変数の宣言の処理 */
		int num2 = 20;
		/* 「ハローJAVA43」と表示させる処理 */
		System.out.println("ハローJAVA"+(num2+num1));
		
		// 問６・『山田太郎 18歳 170.5cm 62.2kg 寿司』の情報を変数にして宣言
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		float weight = 62.2f;
		String food  = "寿司";
		// formatに従い、コンソールに出力する処理
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は"+ age + "歳です");
		System.out.println("身長は"+ height + "cmです");
		System.out.println("体重は"+ weight + "kgです");
		System.out.println("好きな食べ物は"+ food + "です");
		
		// 問７・BMIを出力する処理
		System.out.println("BMIは"+ (String.format("%.1f",(weight/((height/100)*(height/100)))))+ "です");
		
		// 問８・問６で宣言した変数に再代入しコンソール出力
		// 変数nameに鈴木一郎を代入
		name = "鈴木一郎";
		// 変数ageに24を代入
		age = 24;
		// 変数heightに168.5を代入
		height = 168.5;
		// 変数weightに64.2を代入
		weight = 64.2f;
		// 変数foodにオムライスを代入
		food = "オムライス";
		// formatに従い、コンソールに出力する処理
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は"+ age + "歳です");
		System.out.println("身長は"+ height + "cmです");	
		System.out.println("体重は"+ weight + "kgです");
		System.out.println("好きな食べ物は"+ food + "です");
		System.out.println("BMIは"+ (String.format("%.1f",(weight/((height/100)*(height/100)))))+ "です");
		
		//問９・問８で使用した【年齢・身長・体重】の数値を和算で自己代入しコンソール出力
		// 年齢の数値を自己代入
		age  = age * 2;
		// 身長の数値を自己代入
		height = height * 2;
		// 体重の数値を自己代入
		weight = weight * 2;
		// formatに従い、コンソールに出力する処理
		System.out.println("初めまして"+ name + "です");
		System.out.println("年齢は"+ age + "歳です");
		System.out.println("身長は"+ height + "cmです");	
		System.out.println("体重は"+ weight + "kgです");
		System.out.println("好きな食べ物は"+ food + "です");
		System.out.println("BMIは"+ (String.format("%.2f",(weight/((height/100)*(height/100)))))+ "です");
		
		// 問１０・問８で使用した年齢が25歳以上ならtrueが出力
		// 変数ageに24を代入
		age = 24;
		// boolean型の変数isOverAgeを宣言
		boolean isOverAge;
		// 年齢が25歳以上ならtrueが出力される処理
		isOverAge = (age >= 25);
		System.out.println(isOverAge);
		
		// 問１１・問８で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
		// 変数ageを文字列型に型変換
		String stAge = String.valueOf(age);
		// 変数heightを文字列型に型変換
		height = 168.5;
		String stHeight = String.valueOf(height);
		// 変数weightを文字列型に型変換
		weight = 64.2f;
		String stWeight = String.valueOf(weight);
		// 型変換した変数を繋げて出力する処理
		System.out.println(stAge+stHeight+stWeight);
		
		// 問１２・問１１で変換した【年齢・身長】を整数型に変換して出力
		// 変数ageを型変換
		int intAge = Integer.parseInt(stAge);
		// 変数heightを型変換
		double douHeight =  Double.parseDouble(stHeight);
		// 変換した変数をコンソール出力する処理
		System.out.println(intAge);
		System.out.println(douHeight);
		
		// 問１３・問１２で変換した【年齢・身長】が【年齢が25もしくは身長が160以上】であればtrueを出力する処理
		boolean isJustAgeOverHeight = ( intAge == 25 || douHeight >= 160);
		System.out.println(isJustAgeOverHeight);
	}

}
