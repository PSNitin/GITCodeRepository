package com.nitin.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class BracketsValidation {

    public static void main(String[] args){

        System.out.println("Enter the pattern :");
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();

        System.out.println("Pattern is :"+ (validatePattern(pattern)? " Valid": " Not Valid"));
    }

    private static boolean validatePattern(String pattern) {

        if(pattern==null || pattern.length()==0 || pattern.equals("")){
            return true;
        }
        Stack<Character> stk = new Stack<>();
        HashMap<Character,Character> brackMap = new HashMap<>();
        brackMap.put(Character.valueOf(')'),Character.valueOf('('));
        brackMap.put(Character.valueOf(']'),Character.valueOf('['));
        brackMap.put(Character.valueOf('}'),Character.valueOf('{'));

        for(char ch : pattern.toCharArray()){

            if(stk.isEmpty()){
                stk.push(Character.valueOf(ch));
            }else if(brackMap.containsValue(Character.valueOf(ch))){
                stk.push(Character.valueOf(ch));
            }else if(stk.peek().equals(brackMap.get(Character.valueOf(ch)))){
                stk.pop();
            }else {
                stk.push(Character.valueOf(ch));
            }
        }
        return stk.isEmpty();
    }
}
