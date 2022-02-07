package com.nitin.setprac;

import com.nitin.comparator.StringComparator;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class SetOfString {

    public static void main(String[] args){

        //Set<String> set = new TreeSet<>();
        Set<String> set = new TreeSet<>(new StringComparator());
        set.add("abc");
        set.add("xyzab");
        set.add("mno");
        set.add("cdesdfsafsa");
        set.add("bcddety");

        for(String str : set){
            System.out.println(str);
        }
        
    }
}
