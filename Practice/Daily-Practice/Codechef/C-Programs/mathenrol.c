#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int x,y;
        scanf("%d%d",&x,&y);
        int sum=y-x;
        if(sum<=0){
            printf("0\n");
        }else{
            printf("%d\n",sum);
        }
    }
}