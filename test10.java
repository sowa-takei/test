// import java.util.Sccaner;
import java.util.Scanner;
public class test10{
  public static void main(String[] args){
    // Scanner scanner = new Scanner(System.in);
    Scanner scanner = new Scanner(System.in);
    // 巨人の得点変数初期化
    int giants = 0;
    // 阪神の得点変数初期化
    int tigers = 0;
    
    for(int geme = 1; geme <= 9; geme ++){
      System.out.print(geme + "回の表の攻撃は？");
      // 入力してもらった数値をgiantsに代入
      giants += scanner.nextInt();
      System.out.print(geme + "回の裏の攻撃は？");
      // 入力してもらった数値をtigersに代入
      tigers += scanner.nextInt();
    }
    System.out.println("巨人の得点は" + giants + "点です。　阪神の得点は" + tigers + "点です。");
    if(giants < tigers){
      System.out.println("阪神の勝ちです");
    }else if(tigers < giants){
      System.out.println("巨人の勝ちです");
    }else{
      System.out.println("引き分けです");
      scanner.close();
    }
  }
}