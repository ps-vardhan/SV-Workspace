import java.util.Scanner;
public class sort0nd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            int arr[]=new int[n1];
            for(int i=0;i<n1;i++){
                arr[i]=sc.nextInt();
            }
            
            int left=0;
            int right=n1-1;
            while(left<right){
                if(arr[left]==0){
                    left++;
                }else if(arr[right]==1){
                    right--;
                }else{
                    int temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
            }
            for(int i=0;i<n1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
