package com.nitin.practiceProb;
import java.util.*;

public class EvaluationPostfix {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    private static int postfixExpression(String exp) {

        Stack<String> stk = new Stack<>();
        StringTokenizer st = new StringTokenizer(exp, " ");

        while(st.hasMoreElements()){

            String ch = st.nextToken();
            if(ch.equals("+")){
                int num2=Integer.valueOf(stk.pop());
                int num1=Integer.valueOf(stk.pop());;
                int temp = num1+num2;
                stk.push(Integer.toString(temp));
            }else if(ch.equals("-")){
                int num2=Integer.valueOf(stk.pop());
                int num1=Integer.valueOf(stk.pop());;
                int temp = num1-num2;
                stk.push(Integer.toString(temp));
            }else if(ch.equals("*")){
                int temp = Integer.valueOf(stk.pop())*Integer.valueOf(stk.pop());
                stk.push(Integer.toString(temp));
            }else if(ch.equals("/")){
                int num2=Integer.valueOf(stk.pop());
                int num1=Integer.valueOf(stk.pop());;
                int temp = num1/num2;
                stk.push(Integer.toString(temp));
            } else{
                stk.push(ch);
            }
        }
                return Integer.parseInt(stk.pop());
    }
}
