public class hanoi {
    public static void hanoi(String start, String goal, String work, int N){
        if(N <= 1){
            System.out.println(start+" to "+goal);
        }
        else{
            hanoi(start, work, goal, N-1);
            hanoi(start, goal, work, 1);
            hanoi(work, goal, start, N-1);
        }
    }
    public static void main(String[] args) {
        String s = "A";
        String g = "C";
        String w = "B";
        int n = 3;
        System.out.println("Goal: {"+s+" to "+g+"} N="+Integer.toString(n)+"\n");
        System.out.println("Process:");
        hanoi(s, g, w, n);
    }
}