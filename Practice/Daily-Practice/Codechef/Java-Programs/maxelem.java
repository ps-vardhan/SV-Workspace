import java.util.Scanner;

public class maxelem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbes");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int nums:arr){                  
            if(max<nums){
                max=nums;
            }
        }
        System.out.println(max);
        sc.close();
    }
}