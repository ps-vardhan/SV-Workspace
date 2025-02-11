#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        if(x<=70){
            printf("0\n");
        }else if(70<x && x<=100){
            printf("500\n");
        }else if(x>100){
            printf("2000\n");
        }
    }
}