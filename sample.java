public class sample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                sum += i;
                count += 1;
            }
        }
        System.out.println("偶数の合計は" + sum +"です。また、偶数の数は" + count + "です");
    }
}