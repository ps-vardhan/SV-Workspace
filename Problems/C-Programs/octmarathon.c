#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    if(n<3){
        printf("GOLD");
    }else if(3<=n && n<6){
        printf("SILVER");
    }else if(n>=6){
        printf("Bronze");
    }
}