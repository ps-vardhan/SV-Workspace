import java.util.Scanner;

public class numdistri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int posi = 0;
        int negi = 0;
        int zero = 0;
        for (int nums : arr) {                  //increasing count when the required number is encountred
            if (nums > 0) {
                posi++;
            } else if (nums < 0) {
                negi++;
            } else {
                zero++;
            }
        }
        System.out.println(zero + " " + posi + " " + negi);
        sc.close();
    }
}