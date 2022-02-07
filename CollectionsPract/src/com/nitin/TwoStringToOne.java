package com.nitin;

import java.util.*;

public class TwoStringToOne {

    public static void main(String[] args)
    {
        System.out.println("Enter 2 strings:");
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println("output is :"+ longest(s1,s2));
        System.out.println("output is :"+ longest1(s1,s2));
    }

    private static String longest1(String s1, String s2) {

        String str = s1+s2;

        return str.chars().distinct().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();
    }

    public static String longest (String s1, String s2) {

        Set<Character> sortedStr = new TreeSet<>();
        for(char c: s1.toCharArray())
        {
            sortedStr.add(c);
        }
        for(char c: s2.toCharArray())
        {
            sortedStr.add(c);
        }
        Iterator<Character> itr = sortedStr.iterator();

        String str= new String();

        while(itr.hasNext()) {
            str = str + itr.next();
        }
        return str;
    }
}
