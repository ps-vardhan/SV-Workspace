import java.util.Arrays;
import java.util.Scanner;

public class tripletsumK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int key = sc.nextInt();
            int arr[] = new int[n1];
            for (int j = 0; j < n1; j++) {
                arr[j] = sc.nextInt();
            }
            if (sumfinder(key, arr)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
    static boolean sumfinder(int key,int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int currentsum=arr[i]+arr[left]+arr[right];
                if(currentsum==key){
                    return true;
                }else if(currentsum<key){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}