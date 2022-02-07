import java.util.*;

public class FactorialOfNum {

    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println("Factorial is :"+Arrays.toString(factorialOutput(input)));

    }

    private static int[] factorialOutput(int input) {

        ArrayList<Integer> result = new ArrayList<>();
        Integer carry = Integer.valueOf(0);
        result.add(Integer.valueOf(1));

        for(int i=1;i<=input;i++)
        {
            //System.out.println("*Result at itration "+i+" is :"+result);
            for(int j=0;j<result.size();j++)
            {
               // System.out.println("At itration of j loop ----"+j);
                Integer temp = (result.get(j)*Integer.valueOf(i))+carry;
               // System.out.println("-------value of temp is "+temp);
                if(temp.intValue()>9)
                {
                    result.set(j,Integer.valueOf(temp.intValue()%10));
                    carry=Integer.valueOf(temp.intValue()/10);
                }else{
                    result.set(j,temp);
                    carry=Integer.valueOf(0);
                }
            }
            int tempCount=result.size();
            if(carry>9)
            {
                while (carry.intValue()>9){
                    result.add(tempCount,Integer.valueOf(carry.intValue()%10));
                    carry=Integer.valueOf(carry.intValue()/10);
                    tempCount++;
                }
            }
            if(carry<10 && carry>0) {
                result.add(tempCount, carry);
            }
            carry=Integer.valueOf(0);
        }
        Collections.reverse(result);
        int []  arr = new int[result.size()];
        for(int k=0;k<result.size();k++){
            arr[k]=result.get(k).intValue();
        }
        return arr;
    }
}
