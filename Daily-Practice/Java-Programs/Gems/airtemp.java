/* There are three people sitting in a room - Alice, Bob, and Charlie. 
They need to decide on the temperature to set on the air conditioner. Everyone has a demand each:
Alice wants the temperature to be at least - A degrees.
Bob wants the temperature to be at most - B degrees.
Charlie wants the temperature to be at least - C degrees.
Can they all agree on some temperature, or not? */

import java.util.Scanner;

public class airtemp{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int sum=Math.max(a,c);
            if(sum<=b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
	}
}
