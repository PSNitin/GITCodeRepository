package com.nitin.map;

import java.util.*;

public class LinkedHashMapDemo {

    public static void main(String[] args){

        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Nitin",99);
        map.put("Nishant",100);
        map.put("Tom",60);
        map.put("Lee", 40);

        Set<String> keySet = map.keySet();

        System.out.println("Keys :"+keySet);

        Collection<Integer> values= map.values();
        System.out.println("Value set :"+ values);


        for(String key : map.keySet()){
            System.out.println("For key :"+key+" value is "+map.get(key));
        }
    }
}
