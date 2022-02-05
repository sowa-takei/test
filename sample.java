public class sample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0){
            count += 1;
            sum += i;
            }
        }
        System.out.println("偶数の合計は" + sum +"です。また偶数の数は" + count + "です。");
    }
}