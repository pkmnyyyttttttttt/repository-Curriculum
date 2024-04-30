package package_Person;

public class Person {
	
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	
	
	// コンストラクタを定義
	public Person(String name, int age, double height, double weight) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
		
	}
	
	// BMIを計算する処理
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	// 紹介文を表示する処理
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.2f",bmi()) + "です");
	}
	
	// 合計人数を表示する処理
	public void personCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
