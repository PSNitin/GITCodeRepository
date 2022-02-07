package com.nitin.arraylistprac;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void  main(String[] args){

        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("xyz");
        list.add("bcd");

        // using this we can traverse both forward and backward direction
        ListIterator<String> itr = list.listIterator();

        System.out.println("Traversing the list in the forward direction");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Traversing the list in the backward direction");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
