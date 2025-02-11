import java.util.Scanner;

public class secondmax {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int secondmax=0;
            if((a>b && a<c) || (a>c && a<b)){
                secondmax=a;
            }else if((b>a && b<c) || (b>c && b<a)){
                secondmax=b;
            }else{
                secondmax=c;
            }
            System.out.println(secondmax);
        }
        sc.close();
    }    
}
