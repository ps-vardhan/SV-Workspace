/* Given a program which takes N bits of memory, determine whether it is Good or Not Good. 
The program requires 17 bits of memory. This is equivalent to 17/4 =4.25 nibbles. Since 
4.25 is not an integer, this program is not good.
*/

import java.util.Scanner;

public class goodconversion{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            double sum=a/4.0;
            int sum1=(int)sum;
            if(sum!=sum1){
                System.out.println("not Good");
            }else{
                System.out.println("GOOD");
            }
        }
        sc.close();
	}
}
