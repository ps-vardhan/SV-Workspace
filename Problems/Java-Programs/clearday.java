import java.util.Scanner;

class clearday{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=7-a-b;
        System.out.println(c);
        sc.close();
    }
}