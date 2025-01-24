import java.util.Scanner;

public class oddandevensum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num value : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int evtemp = 0;
        int odtemp = 0;
        System.out.println("Enter your numbers : ");
        for (int i = 0; i < n; i++) {                       
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num % 2 == 0) {                         //if even encountered it is added evtemp
                evtemp += num;
            } else {
                odtemp += num;                          //if odd encountered it is added odtemp
            }
        }
        System.out.println(evtemp + " " + odtemp);
        sc.close();
    }
}