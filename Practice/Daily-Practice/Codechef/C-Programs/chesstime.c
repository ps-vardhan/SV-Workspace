#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        int min=x*60;
        int sum=min/20;
        printf("%d",sum);
    }
}