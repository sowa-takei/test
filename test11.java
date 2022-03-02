import java.util.Scanner;
public class test11 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int max_value = 0;
    int min_value = 0;
    System.out.println("数値を入力してください");
    for(int i = 0; i < 10; i++){
      
      int value = scanner.nextInt();
      if(i == 0){
        min_value = value;
        max_value = value;
      }
      
      if(value > max_value){
        max_value = value;
      }
      
      if(value < min_value){
        min_value = value;
      }
    }
    System.out.println("最大値は" + max_value + "です");
    System.out.println("最小値は" + min_value + "です");
    scanner.close();
  }
}