#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    while(n--){
        int a,b;
        scanf("%d%d",&a,&b);
        if(a<b){
            printf("First\n");
        }else if(a==b){
            printf("Any\n");
        }else{
            printf("Second\n");
        }
    }
}