package com.nitin.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args){

        //Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new IdentityHashMap<>();
        Integer  id1= Integer.valueOf(10);//new Integer(10);
        Integer  id2= Integer.valueOf(10);//new Integer(10);
        map.put(id1,"Nitin");
        map.put(id2,"Nishant");

        System.out.println(map);
    }
}
