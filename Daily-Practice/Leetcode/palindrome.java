import java.util.Scanner;

public class palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        palindrome pal=new palindrome();
        System.out.println(pal.palchecker(n));
        sc.close();
    }

    public boolean palchecker(int n){
        int orginal=n,reversed=0;
        while(n>0){
            reversed=reversed*10+(n%10);
            n/=10;
        }
        return orginal==reversed;
    }
}