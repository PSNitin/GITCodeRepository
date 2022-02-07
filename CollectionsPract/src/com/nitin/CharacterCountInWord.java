package com.nitin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCountInWord {

    public static void main(String[] args){

        System.out.println("Enter the word");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println("Do all characters are occurred same amount of time ?: "+ validateWord(word));

    }

    public static boolean validateWord(String word) {
        // your code here
        int max=1;

        Map<Character,Integer> wordCount = new HashMap<>();

        for(char c: word.toCharArray()){

            char cc=Character.toLowerCase(c);
            if(wordCount.containsKey(cc)){
                wordCount.replace(cc,wordCount.get(cc).intValue()+1);
                if(wordCount.get(cc).compareTo(max)>0){
                    max=wordCount.get(cc);
                }
            }else
            {
                wordCount.put(cc,1);
            }

        }

        for(int i:wordCount.values()){
            if(i!=max)
                return false;
        }

        return true;
    }
}
