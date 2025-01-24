import java.util.Scanner;

public class poweroftwo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number value: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int num : arr) {
            if (powcheck(num)) {
                System.out.println(num + " is a power of 2.");
            } else {
                System.out.println(num + " is not a power of 2.");
            }
        }
        sc.close();
    } 

    static boolean powcheck(int num){
        if(num<1){
            return false;
        }
        while(num>1){
            if(num%2!=0){
                return false;
            }
            num/=2;
        }
        return (num==1)?true:false;
    }
}
