public class inte {
  public static void main(String[] args){
    // 20の配列を作成
    int number[] = new int[20];
    // 入力する処理
    for(int i = 0; i < 20; i ++ ){
      // number2に代入していく
       int number2 = (i + 1) * 5;
      // number[i]に計算後の数値を代入
       number[i] = number2;
    }
    // 出力する処理
    for(int i = 0; i < 20; i++){
      // 0~10なら
      if(i <= 10){
        // 奇数求める式
        if(number[i] % 2 != 0){
          // 該当するのが1.3.5.9 ,をつける
          System.out.print(number[i] + ",");
        }else {
          // それ以外はそのまま出力
          System.out.print(number[i]);
        }
      }
      // 11～20なら
      if(i >= 11 && i < 20 ){
        // 奇数求める式
        if(number[i] % 2 != 0){
        // 奇数はそのまま出力
        System.out.print(number[i]); 
      }else {
        // 偶数はカンマをつける
        System.out.print(number[i] + ",");
      }
      }
    }
      // System.out.println(number[i]);
  }
}