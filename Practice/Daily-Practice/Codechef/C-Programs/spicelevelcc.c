#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        int x;
        scanf("%d",&x);
        if(x<4){
            printf("MILD\n");
        }else if((x>=4) && (x<7)){
            printf("MEDIUM\n");
        }else {
            printf("HOT\n");
        }
    }
}