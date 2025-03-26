import java.util.Scanner;

public class prodmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            int m1=sc.nextInt();
            int matA[][]=new int[n1][m1];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    matA[i][j]=sc.nextInt();
                }
            }
            int n2=sc.nextInt();
            int m2=sc.nextInt();
            int matB[][]=new int[n2][m2];
            for(int i=0;i<n2;i++){
                for(int j=0;j<m2;j++){
                    matB[i][j]=sc.nextInt();
                }
            }
            int result[][]=new int[n1][m2];
            for(int i=0;i<n1;i++){
                for(int j=0;j<m2;j++){
                    for(int k=0;k<m1;k++){
                        result[i][j]+=matA[i][k]*matB[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(result[i][j] + " ");
                }
            System.out.println();
        }
        }
        sc.close();
    }    
}
