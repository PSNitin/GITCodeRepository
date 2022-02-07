package com.nitin.comparator;

import java.util.Comparator;

public class SBComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {

        return o2.compareTo(o1);  //reversing the default order which is ascending order.
    }
}
