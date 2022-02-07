package com.nitin.setprac;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

    public static void main(String[] args){

        TreeSet<Integer> s = new TreeSet<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println(s);

        System.out.println("s.ceiling(20) "+s.ceiling(20));  //print element >=20
        System.out.println("s.ceiling(25) "+s.ceiling(25)); // print element >=25

        System.out.println("s.higher(20) "+s.higher(20));  //print element >20

        System.out.println("s.floor(20) "+s.floor(20));  //print element <=20
        System.out.println("s.floor(20) "+s.floor(15));  //print element <=15

        System.out.println("s.lower(20) "+s.lower(20)); //print element <20

        System.out.println("s.pollFirst() "+s.pollFirst());
        System.out.println(s);
        System.out.println("s.pollLast() "+s.pollLast());
        System.out.println(s);
        System.out.println(s.descendingSet());
    }
}
