package package_B;

public class Process_animals {
	
	// フィールド変数の宣言
	private String name;
	private double height;
	private int speed;
	
	
	public Process_animals(String name, double height, int speed) {
		
		// 変数に引数を代入するコンストラクタの作成
		this.name = name;
		this.height = height;
		this.speed = speed;
	}
	
	// nameのゲッター
	public String getName() {
		return this.name;
	}
	
	// nameのセッター
	public void setName(String name) {
		this.name = name;
	}
	
	// heightのゲッター
	public double getHeight() {
		return this.height;
	}
	
	// heightのセッター
	public void setHeight(double height) {
		this.height = height;
	}
	
	// speedのゲッター
	public int getSpeed() {
		return this.speed;
	}
	
	// speedのセッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
