import java.util.Scanner;

public class NumToString {

    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println("Number in string form "+NumToStr(input));
    }

    private static String NumToStr(int input) {

        StringBuffer sb = new StringBuffer();
        sb.append(input/10);
        sb.append(input%10);

        return sb.toString();
    }
}
