public class kadai3{
  public static void main(String[] args){
    int number[] = new int[10];
    for(int i = 0; i < number.length; i++){
      number[i] = i + 1;
      if(number[i] < number.length){
       System.out.print(number[i] + ","); 
      }else {
        System.out.print(number[i]);
      }
    }
  }
}