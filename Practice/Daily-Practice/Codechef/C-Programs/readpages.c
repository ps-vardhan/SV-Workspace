#include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        int a,b,c;
        scanf("%d%d%d",&a,&b,&c);
        int sum=b*c;
        if(a==sum){
            printf("YES\n");
        }else if(a>sum){
            printf("NO\n");
        }else{
            printf("YES\n");
        }
    }
}