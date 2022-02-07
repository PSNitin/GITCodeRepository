import java.util.Scanner;

public class SumTwoNumberString {

    public static void main(String[] args){

        System.out.println("Enter the two integer string");
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println("Sum is :"+ sumOfStringNum(s1,s2));
    }

    private static String sumOfStringNum(String s1, String s2) {

        if(s1.length()<s2.length()){
            return sumOfStringNum(s2,s1);
        }
        StringBuffer result = new StringBuffer();
        int carry=0;
        int maxSize = s1.length();
        int diff=s1.length()-s2.length();

        int i=0;
        int j=0;
        for(int k=maxSize-1;k>=0;k--){

            if(k-diff<0){
                i=Character.getNumericValue(s1.charAt(k))+carry;
                carry=0;
                result.append(i);

            }else{
                i=Character.getNumericValue(s1.charAt(k));
                j=Character.getNumericValue(s2.charAt(k-diff));
                int sum= i+j+carry;

                if(sum>9){
                    carry=sum/10;
                    sum=sum%10;
                }else{
                    carry=0;
                }
                result.append(sum);

            }
        }
        return result.reverse().toString();
    }
}
