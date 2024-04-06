package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問４
		// for文を使用して出力
		// i=9になるまで繰り返し処理
		for(int i=1; i<=9; i++) {
			
			// j=9になるまで繰り返し処理
			for(int j=1; j<=9; j++) {
				
				// i*jの計算式を表示する処理
				System.out.printf("%02d * %02d = %02d",i,j,i*j);
				
				// j=9のとき「||」を表示させない処理
				if(!(j == 9)) {
					
					// 計算式の間に「||」を表示する処理
					System.out.print(" || ");
				}
			}
			// jのループ終了後に改行する処理
			System.out.println();
		}
	}

}
