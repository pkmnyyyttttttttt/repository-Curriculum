package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問５
		// for文を使用して出力
		// y=9になるまで繰り返し処理
		for(int y = 1; y <= 9; y++) {
			
			// x=20になるまで繰り返し処理
			for(int x = 1; x <= 20; x++) {
				
				// x*yの計算式を表示する処理
				System.out.printf("%03d * %03d = %03d",x,y,x*y);
				
				// x=9のとき「||」を表示させない処理
				if(!(x == 20)) {
					
					// 計算式の間に「||」を表示する処理
					System.out.print(" || ");
				}
			}
			// xのループ終了後に改行する処理
			System.out.println();
		}
	}

}
