package package_Person;

public class Person {
	
	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	public static int count = 0;
	
	
	// コンストラクタを定義
	public Person(String firstName, String lastName,int age, double height, double weight) {
		
		this.firstName = firstName;
		// recieveLastnameの呼び出し
		recieveLastname(lastName);
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		
	}
	
	// lastNameの値を引数で受け取るコンストラクタを定義
	public void recieveLastname(String lastName) {
		Person.count++;
		this.lastName = lastName;
	}
	
	
	public String fullName() {
		return this.firstName + this.lastName;
	}
	
	// BMIを計算する処理
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	// 紹介文を表示する処理
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です");
		
		System.out.println("");
	}
	
	// 合計人数を表示する処理
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
