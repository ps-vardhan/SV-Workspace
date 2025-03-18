/* There are N children and Chef wants to give them 1 candy each. Chef already has 
X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly 
4 candies are available.
Determine the minimum number of candy packets Chef must buy so that he is able to give 
1 candy to each of the N children. */


import java.util.Scanner;

public class chefcandies{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(x>=n){
                System.out.println(0);
            }else{
                int sum=(n-x)+3;
                System.out.println(sum/4);
            }
        }
        sc.close();
	}
}
