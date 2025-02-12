#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        int x;
        scanf("%d",&x);
        if(x<=3){
            printf("Bronze\n");
        }else if((x>3) && (x<=6)){
            printf("Silver\n");
        }else{
            printf("Gold\n");
        }
    }
}