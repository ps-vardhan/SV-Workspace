#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        if(x<=98){
            printf("NO\n");
        }else{
            printf("YES\n");
        }
    }
}