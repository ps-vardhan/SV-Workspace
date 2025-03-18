import java.util.Scanner;

/* Efficient Method */

// public class sumofpairs {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(n-->0){
//             int a=sc.nextInt();
//             int k=sc.nextInt();
//             long arr[]=new long[a];
//             for(int i=0;i<a;i++){
//                 arr[i]=sc.nextLong();
//             }
//             if(pairfinder(arr,k,a)){
//                 System.out.println("True");
//             }else{
//                 System.out.println("False");
//             }
//         }
//     }    

//     public static boolean pairfinder(long arr[],int k,int a){
//         Map<Long,Integer> map=new HashMap<>();
//         boolean found=false;
//         for(int i=0;i<a;i++){
//             long comp=k-arr[i];
//             if(map.containsKey(comp)){
//                 return true;
//             }
//             map.put(arr[i],i);
//         }
//         return false;
//     }
// }


/* Brute force Method */

public class sumofpairs {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int k=sc.nextInt();
            long arr[]=new long[a];
            for(int i=0;i<a;i++){
                arr[i]=sc.nextLong();           // not suitable for large input
            }
            boolean found=false;
            for(int i=0;i<a;i++){
                for(int j=i+1;j<a;j++){
                    if(arr[i]+arr[j]==k){
                        found=true;
                    }
                }
            }
            System.out.println(found);
        }
        sc.close();
        
    }
}