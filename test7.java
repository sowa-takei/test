public class test7 {
  public static void main(String[] args){
    for(int i = 0; i < 5; i++){
      for(int k= 0; k < 5-(i + 1); k++){
        System.out.print(" ");
        }
        for(int j= 0; j < (i + 1)*2-1; j++){
          System.out.print(" * ");
        }
      System.out.println("\n");
    }
  }
}