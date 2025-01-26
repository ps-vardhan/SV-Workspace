public class bubblesort {

    static void bubbsorter(int arr[]) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {               // running the loop till last but one element.
            swap = false;                               // setting the condition to false as swap has not occured.
            for (int j = 0; j < n - 1 - i; j++) {       // running the loop from n-1-i as largest elements are sorted after first pass
                if (arr[j] > arr[j + 1]) {              // comparision b/n adjacent elements and swap them. 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)                                  //  checking to see if condition is false or not
                break;
        }
    }

    static void printer(int arr[]) {
        for (int nums : arr) {
            System.out.print(nums + " ");               // looping through output values
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 85, 45, 1, 62 };
        System.out.println("The Input Array");
        printer(arr);
        System.out.println("The Output Array:");
        bubbsorter(arr);
        printer(arr);
    }
}