// import java.util.Scanner;

// public class binaryrepres {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(n-->0){
//             int repres=sc.nextInt();

//             String binary=Integer.toBinaryString(repres);
//             System.out.println(binary);
//         }
//         sc.close();
//     }    
// }


import java.util.Scanner;
public class binaryrepres {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            String Answer=binrepres(n1);
            System.out.println(Answer);
        }
        sc.close();
    }
    static String binrepres(int n){
        if(n==0){
            return "0";
        }
        StringBuilder binary=new StringBuilder();
        while(n>0){
            int rem=n%2;
            binary.append(rem);
            n/=2;
        }
        return binary.reverse().toString();
    }
}