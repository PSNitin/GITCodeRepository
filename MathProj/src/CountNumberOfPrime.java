import java.util.Scanner;

public class CountNumberOfPrime {

    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println("Number of prime for "+input+" is :"+ countPrimes(input));
    }

    //Time complexity is O(N(sqrt(N))
    //outer loop goes N/2 times, so O(N/2)=O(N)
    //inner loop goes Sqrt(N)
    public static int countPrimes(int n) {

        if(n<=2)
            return 0;
        if(n==3){
            return 1;
        }
        if(n==4)
            return 2;

        int count=3;

        for(int i=5;i<n;i=i+2){

            if(i%3==0 || i%5==0){
                continue;
            }else{
                if(isPrime(i)){
                    count++;
                }
            }

        }

        return count;
    }

    static boolean isPrime(int n){

        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;

        }
        return true;
    }

}
