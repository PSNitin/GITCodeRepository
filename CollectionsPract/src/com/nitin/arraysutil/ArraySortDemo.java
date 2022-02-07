package com.nitin.arraysutil;

import com.nitin.collectionsprac.MyComparator;

import java.util.Arrays;
import java.util.List;

public class ArraySortDemo {

    public static void main(String[] args){

        int[] a = {40,10,15,7};

        System.out.println("Before Sort :"+Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After Sort :"+Arrays.toString(a));

        String[] s ={"V","A","Z","a","P"};

        System.out.println("Before Sorting :"+ Arrays.toString(s));

        Arrays.sort(s,new MyComparator());

        System.out.println("After Sorting :"+ Arrays.toString(s));

        List<String> list = Arrays.asList(s);

        s[1]="Y";

        System.out.println("As list :"+list);

        //list.add("U"); //this will through exception. We can't perform operation on this list, which will change the size of s

        System.out.println("After adding in list, checking the array s :"+ Arrays.toString(s));

    }
}
