import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //print prime factors
        findPrimeFactor(input);
    }

    private static void findPrimeFactor(int input) {

        for(int i=2;i<=input;i++){

            while(input%i==0){
                System.out.print(i+" ");
                input=input/i;
            }
        }
    }
}
