package package_Main;

import java.util.Optional;

import package_Process.Process;


public class Main {

	public static void main(String[] args) {
		
		
		// インスタンス生成
		Process process = new Process();
		
		Parameter parameter = new Parameter();
		
		
		// null判定処理
		Optional<String> value = Optional.ofNullable(process.getName());
		
		// 値がnullでないときにコンソール出力する処理
		if (value.isPresent()) {
			
			System.out.println("こんにちは「" + process.getName() + "」さん");
			
			parameter.display();
		}
		
		
	}

}

//サブクラスの生成
class Parameter extends Process {
				
	// コンストラクタ
	public Parameter() {
	}
				
				
	public void display() {
					
		// ステータスの表示
		System.out.println("ステータス");
		System.out.println("HP：" + this.getHitpoint());
		System.out.println("MP：" + this.getMagicpoint());
		System.out.println("攻撃力：" + this.getAttack());
		System.out.println("素早さ：" + this.getSpeed());
		System.out.println("防御力：" + this.getDefence());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
		
	}
				
}