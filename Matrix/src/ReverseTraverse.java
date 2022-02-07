import java.util.Arrays;
import java.util.Scanner;

public class ReverseTraverse {

    public static void main(String[] args) {
        System.out.println("Print the number of row and column");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("row is :" + row + " and Number of col is :" + col);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Traverse normally");
        for(int i=0;i<row;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Printing upside down");
        upsideDown(arr);
    }

    static void upsideDown(int arr[][]){

        System.out.println("Row count is :"+arr.length);

        for(int i= arr.length-1;i>=0;i--){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
