package com.nitin.comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //changing the natural sorting order for String. Now sorting on the basis of length.
        if(o1.length()>o2.length()){
            return -1;
        }else if(o1.length()<o2.length()){
            return 1;
        }else{
            return o1.compareTo(o2);
        }
    }
}
