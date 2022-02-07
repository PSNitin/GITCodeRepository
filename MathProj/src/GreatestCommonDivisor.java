import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args){

        System.out.println("Enter the 2 numbers :");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.println("GCD between "+a+" and "+b+" is :"+ GCD(a,b));

    }

    //time complexity is O(log a)
    private static int GCD(int a, int b) {
        if(b==0)
            return a;

        return GCD(b,a%b);
    }
}
