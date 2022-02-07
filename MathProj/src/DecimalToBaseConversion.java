import java.util.Scanner;

public class DecimalToBaseConversion {

    public static void main(String[] args){

        System.out.println("Enter the number and the base: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int base = sc.nextInt();

        System.out.println("Decimal number "+number+" converted to base "+base+" :"+baseConversion(number,base));
    }

    private static String baseConversion(int number, int base) {

        if(number==0){
            return new String("0");
        }

        StringBuffer resultStr = new StringBuffer();
        int temp=0;
        while(number>0){
            temp=number%base;
            if(base>10){
                if(temp==10){
                    resultStr.append("A");
                }else if(temp==11){
                    resultStr.append("B");
                }else if(temp==12){
                    resultStr.append("C");
                }else if(temp==13){
                    resultStr.append("D");
                }else if(temp==14){
                    resultStr.append("E");
                }else if(temp==15){
                    resultStr.append("F");
                }else{
                    resultStr.append(temp);
                }
            }else{
                resultStr.append(temp);
            }
            number=number/base;
        }
       //resultStr.append(number);
        return resultStr.reverse().toString();
    }
}
