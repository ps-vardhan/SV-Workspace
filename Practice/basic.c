// #include <stdio.h>
// int main(){
//     printf("Hello World\n");
//     printf("This is my first program\n");
//     return 0;
// }



// Array input and output 

#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("The Output Array : ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}