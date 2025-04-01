import java.util.Scanner;

public class missnum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            int sum=(a+1)*((a+1)+1)/2;
            int count=0;
            for(int num:arr){
                count=count+num;
            }
            int ans=sum-count;
            System.out.println(ans);
        }
        sc.close();
    }
}