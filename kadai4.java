public class kadai4 {
  public static void main (String[] args){
    // 入力　配列定義
    int num [] = new int[20];
    for(int i = 0; i < num.length; i++){
      
      num[i] = (i + 1) * 5;
    }
    
    
    for(int i = 0; i < num.length; i++){
      if(i <= 10){
       if(num[i] % 2 != 0){
        System.out.print(num[i] + ",");
       }else {
        System.out.print(num[i]);
       }
      }
      if(i > 10 && i <= 20){
        if(num[i] % 2 != 0){
          System.out.print(num[i]);
        }else {
          System.out.print(num[i] + ",");
        }
      }
    }
  }
}