import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args){

        System.out.println("Print the number of row and column");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr = new int[n][n];

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                arr[row][col]= sc.nextInt();
            }
        }

        System.out.println("Checking if the matrix is magic matrix or not");

        System.out.println(checkMagicMatrix(arr));

    }

    private static boolean checkMagicMatrix(int[][] arr) {

        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=sum+arr[i][0];
        }
        //comparing rowsum and col sum
        for(int row=0;row<arr.length;row++){
            int colSum=0;
            int rowSum=0;
            for(int col=0;col<arr[0].length;col++){

                rowSum=rowSum+arr[row][col];
                colSum=colSum+arr[col][row];

            }
            if(rowSum==colSum && rowSum==sum){
                continue;
            }else{
                return false;
            }
        }

        //comparing diagonal and reverse diagonal
        int diagonalSum=0;
        int reverseDiagonalSum=0;

        for(int i=0;i<arr.length;i++){

            diagonalSum=diagonalSum+arr[i][i];
            reverseDiagonalSum=reverseDiagonalSum+arr[i][arr.length-i-1];
        }

        if(diagonalSum==sum && reverseDiagonalSum==sum){
            return true;
        }else{
            return false;
        }

    }
}
