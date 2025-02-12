import java.util.Scanner;
public class missnum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=100;
    int temp=0;
    //int totalsum=(n+1)*(n+2)/2;
    for(int i=1;i<=n;i++){
        temp+=i;
    }
    int sumofint=0;
    for(int i=0;i<99;i++){
        int num=sc.nextInt();
        sumofint+=num;
    }
    int ans=temp-sumofint;
    System.out.println(ans);
    sc.close();
   }
}