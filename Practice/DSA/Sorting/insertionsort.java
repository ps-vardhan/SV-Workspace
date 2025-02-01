public class insertionsort {
    static void insertsorter(int arr[]) {           // Function initilization
        int n = arr.length;                         // length of the array
        for(int i=1;i<n;i++){
            int key=arr[i];                         // key is second element
            int j=i-1;                              // j is a sorted element
            while(j>=0 && key<arr[j]){              // runs till j greater than 0 and key greater than its right value
                arr[j+1]=arr[j];                    // moves the key value to the right
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    static void arrayprinter(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");            // program to print each element
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 45, 78, 26, 95, 75 };
        System.out.print("The input array : ");
        arrayprinter(arr);
        insertsorter(arr);
        System.out.print("The output array : ");
        arrayprinter(arr);
    }
}