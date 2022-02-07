package com.nitin.setprac;

import java.util.*;

public class HastSetDemo {

    public static void main(String[] args){
        Random obj = new Random();

        List<Integer> list = new ArrayList<>();

        for(int i =1;i<10;i++){
            int num = obj.nextInt(5);
            list.add(num);
        }

        //---List have duplicate
        System.out.println("List is :"+ list);

        Set<Integer> set = new HashSet<>(list);
        //---SET DON'T ALLOW DUPLICATE
        System.out.println("Set --"+set);

    }
}
