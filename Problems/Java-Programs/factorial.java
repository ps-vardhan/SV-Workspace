import java.util.Scanner;

public class factorial {
    public static int temp = 1;

    static void fact(int n) {
        for (int i = 1; i <= n; i++) {          
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
