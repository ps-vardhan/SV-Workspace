import java.util.Scanner;

public class prodofmat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int [][]matrixA=new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    matrixA[i][j]=sc.nextInt();
                }
            }

            int c=sc.nextInt();
            int d=sc.nextInt();
            int matrixB[][]=new int[c][d];
            for(int i=0;i<c;i++){
                for(int j=0;j<d;j++){
                    matrixB[i][j]=sc.nextInt();
                }
            }

            int summat[][]=new int[a][d];
            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    for(int k=0;k<b;k++){
                        summat[i][j]+=matrixA[i][k]*matrixB[k][j];
                    }
                }
            }

            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    System.out.println(summat[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}