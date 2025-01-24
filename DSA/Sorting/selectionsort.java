public class selectionsort {

    static void selsorter(int arr[]) {                      // executing the function of selection sort
        int n = arr.length;                                 // finding the size of the array
        for (int i = 0; i < n - 1; i++) {                   // need to iterate the loop to n-1 as the last element will always be sorted
            int min_index = i;                              // assigining the value of current value of i to min_index
            for (int j = i + 1; j < n; j++) {               // running a second loop that starts after i+1 value
                if (arr[j] < arr[min_index]) {              // checking if the value present in array[j] is less than the mini_index
                    min_index = j;                          // store the value of [j] in min_index
                }
            }
            int temp = arr[i];                              // as the loop needs to be updated tho the next value after sorting
            arr[i] = arr[min_index];                        // input the value of min_index into the outer loop
            arr[min_index] = temp;
        }

    }

    static void printer(int arr[]) {                        // implementing a function that goes through all the elements in an array and prints it.

        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 58, 45, 12, 200 };
        System.out.println("The Input Array:");
        printer(arr);
        System.out.println("The Output Array:");
        selsorter(arr);
        printer(arr);

    }
}
