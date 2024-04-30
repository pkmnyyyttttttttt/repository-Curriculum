package package_Main;


import package_Person.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木","太郎" ,20, 1.7,60);
		// メソッドの呼び出し
		person1.print();
		
		Person person2 = new Person("山田","花子", 22, 1.5,40);
		// メソッドの呼び出し
		person2.print();
		
		// 合計人数を表示するメソッドの呼び出し
		Person.printCount();
		
		
	
	}

}
