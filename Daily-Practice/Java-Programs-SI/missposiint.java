import java.util.Scanner;

public class missposiint {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<a;i++){
                while(arr[i]>0 && arr[i]<=a && arr[arr[i]-1]!=arr[i]){
                    int temp=arr[arr[i]-1];
                    arr[arr[i]-1]=arr[i];
                    arr[i]=temp;
                }
            }
            boolean flag=false;
            for(int i=0;i<a;i++){
                if(arr[i]!=i+1){
                    System.out.println(i+1);
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(a+1);
            }
        }
        sc.close();
    }
}
