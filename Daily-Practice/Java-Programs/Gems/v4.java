/* In discus throw, a player is given 3 throws and the throw with the longest distance 
is regarded as their final score.
You are given the distances for all 3 throws of a player. 
Determine the final score of the player. */

import java.util.Scanner;

public class v4{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=Math.max(a,Math.max(b,c));
            System.out.println(sum);
        }
        sc.close();
	}
}
