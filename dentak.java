public class dentak {
  public static void main (String[] args){
    // 最初の数字定義
    int val1 = 0;
    // 次の数字
    int val2 = 0;
    // 演算子 
    String ope;
    
    if(args.length != 3){
      System.out.println("usage :java dentak 数値　演算子　数値");
      System.out.println("演算子は kake waru tasu hikuの4つです");
      // プログラムを終了する
      System.exit(0);
    }
    val1 = Integer.parseInt(args[0]);
    val2 = Integer.parseInt(args[2]);
    ope = args[1];
    System.out.println("入力された式は" + val1 +"" + ope + "" + val2 + "です");
  }
}