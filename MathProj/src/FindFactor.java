import java.util.Scanner;

public class FindFactor {

    //find the number of factors and sum of factors for a given number

    public static void main(String[] args){

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] result = new int[2];

        result = numberOfDivisorsAndSum(input);
        System.out.println("Count is :"+result[0]+"--- Sum is "+result[1]);


    }

    private static int[] numberOfDivisorsAndSum(int input) {

        if(input==1){
            return new int[]{1,1};
        }
        int sum=0;
        int count=0;
        for(int i=1;i<=Math.sqrt(input);i++){

            if(input%i==0){

                if(i==input/i){
                    count++;
                    sum=sum+i;
                }else{
                    count=count+2;
                    sum=sum+i+(input/i);
                }
            }
        }
        return new int[]{count,sum};
    }


}
