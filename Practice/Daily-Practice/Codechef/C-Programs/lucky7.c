#include<stdio.h>
int main(){
    char str[10];
    scanf("%s",str);
    for(int i=0;str[i]!='\0';i++){
        if(i==6){
            printf("%c",str[i]);
        }
    }
}