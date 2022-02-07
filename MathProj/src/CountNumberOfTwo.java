import java.util.Scanner;

public class CountNumberOfTwo {
    //Write a program that counts the number of occurrences of 2 as a digit in numbers from 0 to n
    //
    //That is, count the number of 2s as a digit in all numbers from 0 to n.

    public static void main(String[] args){

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        System.out.println("Numbers of 2 as digit in "+input+" is :"+numOfTwo(input));

    }

    private static int numOfTwo(int input) {

        String str = new String();

        for(int i=1;i<input;i++){
            str=str+i;
        }
        System.out.println(str);
        return  str.replaceAll("[013456789]","").length();

    }
}
