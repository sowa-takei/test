public class fizzbuzz {
  public static void main (String[] args){
    for(int i = 0; i <= 100; i++){
      if(i % 3 == 0 && i % 5 == 0){
        System.out.print("εζδΈζ");
      }else if (i % 3 == 0){
        System.out.print("fizz");
      }else if (i % 5 == 0){
        System.out.print("buzz");
      }
  }
  
}
}