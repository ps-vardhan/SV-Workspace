public class distinctnumonboard {
    public static int distinctIntegers(int n) {
        if(n==1){
            return 1;               // If n = 1, the answer is 1. As [any number]%1 =1 
        }                           // Due to which it will never added to the board.
        return n-1;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(distinctIntegers(n));
    }
}