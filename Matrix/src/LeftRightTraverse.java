import java.util.Scanner;

public class LeftRightTraverse {
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

        traverseLeftRight(arr);
    }

    private static void traverseLeftRight(int[][] arr) {

        for(int row=0;row< arr.length;row++){

            for(int col=0;col<arr[0].length;col++){

                if(row%2==0){
                    System.out.print(arr[row][col]+" ");
                }else{
                    System.out.print(arr[row][arr[0].length-col-1]+" ");
                }
            }
            System.out.println();
        }
    }


}
