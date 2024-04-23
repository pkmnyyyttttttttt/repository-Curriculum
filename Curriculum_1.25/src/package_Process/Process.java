package package_Process;


import java.util.Random;
import java.util.Scanner;


// 親クラス
public class Process {
	
	// キーボードから入力を受けるためのscanner
	Scanner scanner = new Scanner(System.in);
	
	// フィールド変数の宣言
	private String name;
	
	// ステータスはランダムな値で表示
	Random random = new Random();
	private int hitpoint = random.nextInt(1000) + 1;
	private int magicpoint = random.nextInt(1000) + 1;
	private int attack = random.nextInt(1000) + 1;
	private int speed = random.nextInt(1000) + 1;
	private int defence = random.nextInt(1000) + 1;
	
	// コンストラクタ
	public Process() {
		// 名前入力処理
		this.name = scanner.nextLine();
	}
		
	// nameのセッター
	public void setName(String name) {
		this.name = name;
	}
	
	// nameのゲッター
	public String getName() {
		return this.name;
	}
	
	// getHitpointのゲッター
	public int getHitpoint() {
		return this.hitpoint;
	}
	
	// magicpointのゲッター
	public int getMagicpoint() {
		return this.magicpoint;
	}
	
	// attackのゲッター
	public int getAttack() {
		return this.attack;
	}
	
	// speedのゲッター
	public int getSpeed() {
		return this.speed;
	}
	
	// defenceのゲッター
	public int getDefence() {
		return this.defence;
	}


}


