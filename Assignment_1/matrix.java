import java.util.Scanner;

public class matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter dimensions of mat1 :");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter dimensions of mat2 :");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int mat1[][] = new int [r1][c1];
        int mat2[][] = new int [r2][c2];
        if(c1==r2){
            System.out.println("Enter matrix 1 :");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print("Enter element("+i+","+j+") :");
                    mat1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter matrix 2 :");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    System.out.print("Enter element("+i+","+j+") :");
                    mat2[i][j]=sc.nextInt();
                }
            }
            System.out.println("Final Matrix :");
            int multiply[][] = new int [100][100];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    multiply[i][j] =0;
                    for(int k=0;k<c1;k++){
                        multiply[i][j] += mat1[i][k] * mat2[k][j];
                    }
                    System.out.print(multiply[i][j] + " ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Enter the valid Input");
        }
        sc.close();
    }
}
