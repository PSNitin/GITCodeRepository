package com.nitin.collectionsprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

    public static void main(String[] args){

        List<String> l = new ArrayList<>();

        l.add("z");
        l.add("a");
        l.add("X");
        l.add("B");

        System.out.println("Before Sorting :"+ l);

        Collections.sort(l);
        //Collections.sort(l, new MyComparator());
        System.out.println("After Sorting :"+ l);

        int result = Collections.binarySearch(l,"X");
        System.out.println("Index of the element :"+result);

        result = Collections.binarySearch(l,"C");
        System.out.println("Index of the element C is:"+result);
    }
}
