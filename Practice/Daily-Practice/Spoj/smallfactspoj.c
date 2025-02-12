#include <stdio.h>

#define MAX 500  // Maximum digits for 100!

// Function to multiply large numbers stored in an array
int multiply(int x, int res[], int res_size) {
    int carry = 0; // Carry for multiplication

    for (int i = 0; i < res_size; i++) {
        int prod = res[i] * x + carry;
        res[i] = prod % 10;  // Store last digit
        carry = prod / 10;   // Pass the carry
    }

    while (carry) { // Store remaining carry digits
        res[res_size] = carry % 10;
        carry /= 10;
        res_size++;
    }

    return res_size;
}

// Function to compute factorial of n
void factorial(int n) {
    int res[MAX];  // Array to store the result
    res[0] = 1;    // Initial value
    int res_size = 1;

    for (int x = 2; x <= n; x++) {
        res_size = multiply(x, res, res_size);
    }

    // Print result in reverse (since digits are stored backwards)
    for (int i = res_size - 1; i >= 0; i--) {
        printf("%d", res[i]);
    }
    printf("\n");
}

int main() {
    int t, n;
    scanf("%d", &t);

    while (t--) {
        scanf("%d", &n);
        factorial(n);
    }

    return 0;
}
