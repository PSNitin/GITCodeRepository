import java.util.Scanner;

public class SpiralTraverse {

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
        System.out.println("Spiral traversing:");
        spiralTraversing(arr);
    }

    private static void spiralTraversing(int[][] arr){
        int flag=0; // 0 Right; 1 down; 2 left; 3 up

        int colLow=0;
        int colHigh=arr[0].length-1;
        int rowLow=0;
        int rowHigh=arr.length-1;

        int row=0;
        int col=0;

        for(int i=0; i<arr.length * arr[0].length;){
           // System.out.print(" i "+i+"--");
            if(flag==0) //printing row left to right
            {
                 while(col<=colHigh){
                     System.out.print(arr[row][col]+" ");
                     i++;
                     col++;
                 }

                 if(col==colHigh+1){   //setting up for down move
                     col=colHigh;
                     rowLow=rowLow+1;
                     row=rowLow;
                     flag=1;
                 }
            }else if(flag==1) {      //printing from up to down

                while(row<=rowHigh){
                    System.out.print(arr[row][col]+" ");
                    i++;
                    row++;
                }

                if(row==rowHigh+1) {  //setting up for left move
                    row = rowHigh;
                    colHigh = colHigh - 1;
                    col = colHigh;
                    flag = 2;
                }
            }else if(flag==2){       //printing from right to left

                while(col >=colLow){
                    System.out.print(arr[row][col]+" ");
                    col--;
                    i++;
                }

                if(col ==colLow-1){ //setting up for up move
                    col=colLow;
                    rowHigh=rowHigh-1;
                    row=rowHigh;
                    flag=3;
                }
            }else if(flag==3){   //printing from down to up

                while(row>=rowLow){
                    System.out.print(arr[row][col]+" ");
                    row--;
                    i++;
                }

                if(row==rowLow-1){  //setting up for right move
                    row=rowLow;
                    colLow=colLow+1;
                    col=colLow;
                    flag=0;
                }
            }
        }
    }

}
