#include<stdio.h>
int main(){
    int n,o;
    scanf("%d %d",&n,&o);
    int x=n+o;
    char str[10];
    sprintf(str,"%d%d",x,1);
    printf("%s",str);
}