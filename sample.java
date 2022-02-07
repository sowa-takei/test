public class sample {
    public static void main(String[] args) {
        // 偶数の数を求めるcountを定義
        int count = 0;
        // 偶数の合計を求めるsumを定義
        int sum = 0;
        // 10までを繰り返し実施
        for (int i = 1; i <= 10; i++){
            // iを2で割ったとき０偶数な条件
            if(i % 2 == 0){
                // iの数をsumに足していく
                sum += i;
                // その条件になった時の数を足していく
                count += 1;
            }
        }
        System.out.println("偶数の合計は" + sum +"です。また、偶数の数は" + count + "です");
    }
}