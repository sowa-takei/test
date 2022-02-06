public class integer {
  public static void main (String[] args) {
    int [] integer = {1,2,3,4,5,6,7,8,9,10};
    for(int i = 0; i < integer.length; i++){
       System.out.println(integer[i]);
       if(i < integer.length -1){
         System.out.println(",");
       }
    }
  } 
}