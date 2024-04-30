package package_Main;


import package_Person.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("鈴木太郎", 20, 1.7,60);
		
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.height);
		
		
		//メソッドの呼び出し
		person.print();
		
		person.personCount();
		
		
	
	}

}
