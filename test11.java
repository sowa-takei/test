import java.util.Scanner;
public class test11 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int max_value = 0;
    for(int i = 0; i < 10; i++){
      int value = scanner.nextInt();
      if(value > max_value){
        max_value = value;
      }
    }
    System.out.print("最大値は" + max_value + "です");
    scanner.close();
  }
}