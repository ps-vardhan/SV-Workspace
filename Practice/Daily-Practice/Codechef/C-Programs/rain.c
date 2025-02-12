#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        if(x<3){
            printf("LIGHT\n");
        }else if(x>=3 && x<7){
            printf("MODERATE\n");
        }else{
            printf("HEAVY\n");
        }
    }
}