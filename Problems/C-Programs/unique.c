// #include <stdio.h>
// int sorting(int arr[], int n);
// int uniq(int arr[], int n);
// int main()
// {
//     int n;
//     scanf("%d", &n);
//     int arr[n];
//     for (int i = 0; i < n; i++)
//     {
//         scanf("%d", &arr[i]);
//     }
//     sorting(arr, n);
//     uniq(arr, n);
// }
// int sorting(int arr[], int n)
// {
//     for (int i = 0; i < n - 1; i++)
//     {
//         for (int j = 0; j < n - i - 1; j++)
//         {
//             if (arr[j] > arr[j + 1])
//             {
//                 int temp = arr[j];
//                 arr[j] = arr[j + 1];
//                 arr[j + 1] = temp;
//             }
//         }
//     }
// }
// int uniq(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         if ((i == 0 || arr[i] != = arr[i - 1]) && (i == n - 1 || arr[i] != arr[i + 1]))
//         {
//             printf("%d ", arr[i]);
//         }
//     }
// }
//------------------------------------------
#include <stdio.h>

int uniq(int arr[], int n);

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    uniq(arr, n);
}

int uniq(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int count = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[i] == arr[j])
            {
                count++;
            }
        }
        if (count == 1)
        {
            printf("%d ", arr[i]);
        }
    }
}