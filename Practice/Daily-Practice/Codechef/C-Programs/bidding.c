#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a,b,c;
        scanf("%d%d%d",&a,&b,&c);
        int max;
        if(a>b && a>c){
            max=a;
        }else if(b>a && b>c){
            max=b;
        }else if(c>a && c>b){
            max=c;
        }
        if(max==a){
            printf("ALICE\n");
        }else if(max==b){
            printf("BOB\n");
        }else{
            printf("CHARLIE\n");
        }
    }
}