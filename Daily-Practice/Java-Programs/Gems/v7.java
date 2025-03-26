/*There are 4 companies in the markets of Chefland A,B,Cand D.
There is said to be a monopoly in the market if the profit made by one company 
is strictly greater than the sum of profits made by all other companies.
Determine if there is a monopoly in the market or not. */

import java.util.Arrays;
import java.util.Scanner;

public class v7{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int arr[]=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[0]+arr[1]+arr[2]<arr[3]){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
	}
}
