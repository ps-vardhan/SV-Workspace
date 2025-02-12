#include<stdio.h>

int merger(int n1,int arr1[],int n2,int arr2[],int unimerge[]);

int main(){
    int n1;
    scanf("%d",&n1);
    int arr1[n1];
    for(int i=0;i<n1;i++){
        scanf("%d",&arr1[i]);
    }

    int n2;
    scanf("%d",&n2);
    int arr2[n2];
    for(int i=0;i<n2;i++){
        scanf("%d",&arr2[i]);
    }

    int sum=n1+n2;
    int unimerge[sum];

    merger(n1,arr1,n2,arr2,unimerge);
    sorter(sum,unimerge);
    for(int i=0;i<sum;i++){
        printf("%d ",unimerge[i]);
    }
}

int merger(int n1,int arr1[],int n2,int arr2[],int unimerge[]){
    int i;
    for(i=0;i<n1;i++){
        unimerge[i]=arr1[i];
    }
    for(int j=0;j<n2;j++){
        unimerge[i+j]=arr2[j];
    }
}

int sorter(int sum,int unimerge[]){
    for(int i=0;i<sum;i++){
        for(int j=0;j<sum-i-1;j++){
            if(unimerge[j]>unimerge[j+1]){
                int temp=unimerge[j];
                unimerge[j]=unimerge[j+1];
                unimerge[j+1]=temp;
            }
        }
    }
}