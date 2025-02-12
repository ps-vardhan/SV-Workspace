#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int n1;
        scanf("%d",&n1);
        if(n1<=10){
            printf("YES\n");
        }else{
            printf("NO");
        }
    }
}