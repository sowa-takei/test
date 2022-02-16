public class kadai1{
  public static void main(String[] args){
    // 配列を宣言
    int num [] = new int[10];
    for(int i = 0; i < num.length; i++){
      // 代入
      num[i] = i + 1;
      // 偶数を求める式
      if(num[i] % 2 == 0){
        System.out.print(num[i]);
      }
    }
  }
}