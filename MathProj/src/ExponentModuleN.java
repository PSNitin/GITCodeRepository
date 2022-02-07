public class ExponentModuleN {

    public static void main(String[] args){

        int x=87423100;
        int y= 50000;
       // String stringX= String.valueOf(x);
        //System.out.println(stringX);
        //String result=stringX;
        long modulo = (long)(Math.pow(10,9)+7);
        System.out.println("Modulo value is "+modulo);
        long result=1;
        //For calculating reminder
        for(int i=1;i<=y;i++){
            result=(result*x)%modulo;
        }
        System.out.println("Reminder is "+result);
        //---------------------------------------------------
        //---Reminder and Quotient
        long quotient =0;
        long reminder =1;
        for(int i=1;i<=y;i++){
            quotient=(quotient +((reminder*x)/modulo));
            reminder=(reminder*x)%modulo;
        }
        System.out.println("Quotient is :"+quotient);
        System.out.println("Reminder is :"+reminder);

        //System.out.println(Math.exp(Math.pow(x,y)));
    }
     // useful code, used to multiply between two big integers in string formats
    /*
    private static String stringMultiply(String s1, String s2) {

        StringBuffer result=new StringBuffer();
        int intS1 = Integer.parseInt(s1);
        //System.out.println("intS1 ---"+intS1);
        int carry=0;
        for(int i=s2.length()-1;i>=0;i--){
            //System.out.println("Result inside loop ---"+result.toString());
            int temp = Character.getNumericValue(s2.charAt(i));
            temp =temp*intS1+carry;
            carry=0;
            if(temp>9){
                carry=temp/10;
            }
            result.append(Integer.toString(temp%10));
        }

        if(carry>0) {
            return Integer.toString(carry)+result.reverse().toString();
        }

        return result.reverse().toString();
    }

     */
}
