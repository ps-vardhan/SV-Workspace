import java.util.Scanner;
class bestof2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
        sc.close();
    }
}