public class kadai3{
  public static void main(String[] args){
    // 配列宣言
    int number[] = new int[10];
    for(int i = 0; i < number.length; i++){
      number[i] = i + 1;
      // number.lengthが10だから9までは出力
      if(number[i] < number.length){
        // 数字の後に，をつける
       System.out.print(number[i] + ","); 
      }else {
        // 該当するのが10だからそのまま出力
        System.out.print(number[i]);
      }
    }
  }
}