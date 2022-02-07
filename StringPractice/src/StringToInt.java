import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args){

        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println("String to Integer Conversion "+strToInt(input));

    }

    private static int strToInt(String input) {
        int sum=0;
        int pow=1;

        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='-'){
                sum=sum*(-1);
            }else{
                sum=sum+Character.getNumericValue(input.charAt(i))*pow;
                pow=pow*10;
            }
        }
        return sum;
    }

}
