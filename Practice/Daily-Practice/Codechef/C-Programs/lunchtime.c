#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        if(1<=x && x<=4){
            printf("YES\n");
        }else{
            printf("NO\n");
        }
    }
}