import java.util.Scanner;

public class FindPrime {

    public static void main(String[] args){

        int input=0;
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        input=sc.nextInt();

        System.out.println(isPrime(input));

    }


    public static boolean isPrime(int n){

        //----------------------------------
        //with O(N) as time complexity
        /*
        for(int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }
        }

        return true;

         */
        //----------------------------------

        //--------------------------------
        // with O(sqrt(N)) time complexity
        /*
        for(int i=2;i<=Math.sqrt(n);i++){

            if(n%i==0){
                return false;
            }
        }
        return true;
         */
        //--------------------------------

        //----------------------------------
         //using recursion : time complexity O(sqrt(n))

            return primeUsingRecursion(n,2);
        //----------------------------------
    }

    private static boolean primeUsingRecursion(int n, int i) {

        if(i>Math.sqrt(n)){
            return true;
        }else{

            return (n%i==0)? false : primeUsingRecursion(n,i+1);
        }
    }
}
