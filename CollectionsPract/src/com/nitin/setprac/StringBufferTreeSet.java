package com.nitin.setprac;

import com.nitin.comparator.SBComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSet {

    public static void main(String[] args){

        //Set<StringBuffer> set = new TreeSet<>();
        Set<StringBuffer> set = new TreeSet<>(new SBComparator());

        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("xyz"));
        set.add(new StringBuffer("mno"));
        set.add(new StringBuffer("cde"));
        set.add(new StringBuffer("bcd"));

        for(StringBuffer str : set){
            System.out.println(str);
        }

    }
}
