import java.util.Scanner;

public class factorial {
    public static int temp = 1;

    static void fact(int n) {
        for (int i = 1; i <= n; i++) {          //if n=5 ans => 5*4*3*2*1
            temp = temp * i;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int a = sc.nextInt();
        fact(a);
        sc.close();
    }
}
