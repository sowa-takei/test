public class kadai4 {
  public static void main (String[] args){
    // 入力　配列定義
    int num [] = new int[20];
    for(int i = 0; i < num.length; i++){
      // for文の初期値0に１を足して*5をしていく0～19
      num[i] = (i + 1) * 5;
    }
    
    // 出力　for文
    for(int i = 0; i < num.length; i++){
      // 10まではtrue num[i]に
      if(i <= 10){
        // 割り切れなかったら
       if(num[i] % 2 != 0){
        // 奇数の後に,をつける
        System.out.print(num[i] + ",");
       }else {
        // 偶数はそのまま出力
        System.out.print(num[i]);
       }
      }
      // 10~19
      if(i >= 11 && i < 20){
        if(num[i] % 2 != 0){
          // 奇数はそのまま出力
          System.out.print(num[i]);
        }else {
          // 偶数の後に,をつける.
          System.out.print(num[i] + ",");
        }
      }
    }
  }
}