#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        if(x>24){
            printf("YES\n");
        }else if(x==24){
            printf("NO\n");
        }else{
            printf("NO\n");
        }
    }
}