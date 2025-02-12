#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int g,b;
        scanf("%d%d",&g,&b);
        int sum=b-g;
        printf("%d\n",sum);
    }
}