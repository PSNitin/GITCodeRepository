package com.nitin.practiceProb;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
       // System.out.println("Comparing O2 :"+o2+" and O1 :"+o1 +" : "+o2.compareTo(o1));
       return o2.compareToIgnoreCase(o1);
    }

}
