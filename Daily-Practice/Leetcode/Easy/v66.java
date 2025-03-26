public class v66 {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i++){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int arr[]=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}


/* The code is not Efficient in case of large input */

// public class plusone {
//     public int[] pluone(int[] digits) {
//         long count=0;
//         for(int i=0;i<digits.length;i++){
//             count=count*10+digits[i];
//         }
//         count+=1;

//         String str=Long.toString(count);
//         int str1[]=new int[str.length()];

//         for(int i=0;i<str.length();i++){
//             str1[i]=str.charAt(i)-'0';
//         }
//         return str1;
//     }
// }