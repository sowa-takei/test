// Scannerクラスを使うためのimport文
import java.util.Scanner;
public class test9 {
  public static void main(String[] args){
    System.out.println("数値を入力してください");
    // Scannerクラスを初期化
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    System.out.println(num1 + "+" + num2 + "=" + sum);
    scanner.close();
  }
}