#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        int a,b,c;
        scanf("%d%d%d",&a,&b,&c);
        int sum=(2*a)+(2*b);
        int sum1=sum*c;
        printf("%d ",sum1);
    }
}