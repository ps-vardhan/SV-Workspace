/*Basic input and output */

// import java.util.Scanner;
// class play{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);      //scans where the input is given (System.in) general keyboard.
//         System.out.println("Enter your input : ");
//         int n=sc.nextInt();                     //takes only one input
//         System.out.println(n);                  //prints the output
//         int nn=sc.nextInt();                    //upon giving 2 values in same line only one value is printed
//         System.out.println(nn);                 //second value can be printed as mentioned
        
//     }
// }

/*Reading an entire string form of input */
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;                                   //importing required packages
// import java.util.Scanner;
// public class playground{
//     public static void main(String []args)throws IOException{       //initilizing (throws IOException) as its thrown 
//         BufferedReader br=                                          //when an input or output operation fails or is interrupted
//         new BufferedReader(new InputStreamReader(System.in));       //object creation of a bufferedreader(br) that initializes a  
//         Scanner sc=new Scanner(System.in);                                                            //new Inputstreamreader within the keyboard(System.in).
//         System.out.println("Enter your Input : ");                  
//         String n=br.readLine();                                     //reading the line and printing it
//         System.out.println(n);                                                        
//         String st=sc.nextLine();                                    //functions same as a bufferedreader
//         System.out.println(st);                                     //br is used to read large amounts of data / sc is used to read small data
//     }
// }

//--------------------------------------------------------------------------------------------------------
/*Data types */
// import java.util.Scanner;
// class playground {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int a=999999999;                   //limit of int type
//         long b=999999999;                  //limit of long type
//         float c=1234.578;
//         double d=5.5;
//     }
    
// }


// import java.util.Scanner;

// public class playground {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your input here : ");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         int evtemp=0;
//         int odtemp=0;
//         for(int i=0;i<=n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int num:arr){
//             if(num%2==0){
//                 evtemp+=num;
//             }else{
//                 odtemp+=num;
//             }
//         }
//         System.out.println(evtemp+" "+odtemp);
//         sc.close();
//     }
// }






// import java.util.*;             //function implementation.

// public class play {                    
//     static void merger(){
//         System.out.println("hello!");
//     }
//     static int hanger(int a,int b){
//         int c=a+b;
//         return c;
//     }

//     public static void main(String [] args){
//         merger();
//         System.out.println(hanger(5,5));
//     }
// }
//----------------------------------------------------------------------------------------------------

// import java.util.Scanner;                //Program that asks for a size and stores the array
// public class sorter {
//     public static void main(String[] args) {    
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int nums[]=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         for(int noms:nums){
//             System.out.println(noms);       //used to convert an array into string
//         }
//         System.out.println(nums);           //gives an hash that is non human readable
//     }
// }




