import java.util.Scanner;

public class linearsearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(tar==arr[i]){
                ans+=i;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
