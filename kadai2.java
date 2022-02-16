public class kadai2 {
  public static void main(String[] args) {
    // 配列宣言
    int num[] = new int[10];
    // 合計の変数を定義
		int sum = 0;
		// 偶数の個数を定義
		int count = 0;
		for(int i = 0; i < num.length; i++) {
		  num[i] = i + 1;
		  // 偶数を求める式
			if(num[i] % 2 == 0) {
			 // 偶数の値を代入
				sum += num[i];
				// 偶数だった場合１つづつ足していく
				count += 1;
			}
		}
		System.out.print("偶数の個数は"+ count + "です。また、偶数の合計は" +  sum);
	}

}