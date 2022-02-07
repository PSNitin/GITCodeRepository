import java.util.Scanner;

public class FibonacciNum {

        public static void main(String[] args){
            System.out.println("Give integer input :");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            System.out.println(findNthFibonacci(input));

        }

    static int findNthFibonacci(int n){
        //time complexity is O(2^n)
        if(n<=1){
            return n;
        }

        return findNthFibonacci(n-1)+findNthFibonacci(n-2);
    }
}
