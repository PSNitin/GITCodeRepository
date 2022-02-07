import java.util.Arrays;
import java.util.Scanner;

public class RightLeftTraverse {

    public static void main(String[] args) {
        System.out.println("Print the number of row and column");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int[][] outputArr = new int[row][col];

        System.out.println("row is :" + row + " and Number of col is :" + col);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(arr[0].length);
        outputArr = rightToLeft(arr);

        System.out.println("Right to left traverse");
        for(int i=0;i<row;i++) {
            System.out.println(Arrays.toString(outputArr[i]));
        }

    }

    private static int[][] rightToLeft(int[][] arr) {

        int[][] outputArr = new int[arr.length][arr[0].length];

        for(int row=0;row<arr.length;row++){

            for(int col=0;col<arr[0].length;col++){
                outputArr[row][col]=arr[row][arr[0].length-col-1];
            }
        }

        return  outputArr;
    }

}
