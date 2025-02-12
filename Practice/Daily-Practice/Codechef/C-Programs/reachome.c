#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        int a,b;
        scanf("%d%d",&a,&b);
        int sum=a*5;
        if(sum>=b){
            printf("Yes\n");
        }else{
            printf("No\n");
        }
    }
}