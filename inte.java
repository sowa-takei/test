public class inte {
  public static void main(String[] args){
    int number[] = new int[20];
    // 入力する処理
    for(int i = 0; i < 20; i ++ ){
       int number2 = (i + 1) * 5;
       number[i] = number2;
    }
    // 出力する処理
    for(int i = 0; i < 20; i++){
      if(i <= 10){
        if(number[i] % 2 != 0){
          System.out.print(number[i] + ",");
        }else {
          System.out.print(number[i]);
        }
      }
      if(i >= 11 && i < 20 ){
        if(number[i] % 2 != 0){
        System.out.print(number[i]); 
      }else {
        System.out.print(number[i] + ",");
      }
    }
  }
      // System.out.println(number[i]);
}
}