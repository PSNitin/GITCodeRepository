package com.nitin.setprac;

import java.util.*;

public class DifferentSets {

    public static void main(String[] args){

        Random obj = new Random();

        //Set<Integer> set = new HashSet<>(); //don't maintain order
        //Set<Integer> set = new LinkedHashSet<>(); //maintain the order
        Set<Integer> set = new TreeSet<>(); //Sorted order

        for(int i=1; i<=5; i++){
            int num = obj.nextInt(100);
            set.add(num);
            System.out.println(num);
        }

        //System.out.println("Hash set elements "+set);
        //System.out.println("LinkedHashSet elements "+set);
        System.out.println("TreeSet elements "+set);

        //Iterate through Set
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("After itrator :"+set);

    }
}
