/* Given an Integer N, write a program to reverse it. */

import java.util.Scanner;

public class v9{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int rev=0;
            while(a>0){
                int digit=a%10;
                rev=rev*10+digit;
                a=a/10;
            }
            System.out.println(rev);
        }
        sc.close();
	}
}

