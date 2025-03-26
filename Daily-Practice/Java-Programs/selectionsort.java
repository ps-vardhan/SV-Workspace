import java.util.Scanner;

public class selectionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt();
            int arr[] = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = a - 1; i >= 1; i--) {
                int minindex = 0;
                for (int j = 0; j <= i; j++) {
                    if (arr[j] > arr[minindex]) {
                        minindex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
                System.out.print(minindex + " ");
            }

            System.out.println();

        }
        sc.close();
    }
}