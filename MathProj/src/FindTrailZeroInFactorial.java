import java.util.Scanner;

public class FindTrailZeroInFactorial {

    public static void main(String[] args){

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);

        int input= sc.nextInt();

        System.out.println("Number of tailing zero in factorial is :"+TrailingZeroCount(input));
    }

    private static int TrailingZeroCount(int n) {
        int power=5;
        int count=0;
        while(power<=n){
            count=count+(n/power);
            power=power*5;
        }

        return count;
    }
}
