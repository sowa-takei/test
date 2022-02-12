public class inte {
  public static void main(String[] args){
    int number[] = new int[20];
    for(int i = 0; i <= 18; i ++ ){
      number[i + 1] = number[i] + 5;
      System.out.println(number[i]);
    }
  }
}