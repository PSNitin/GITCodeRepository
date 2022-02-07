package com.nitin;

import java.util.*;
import java.util.stream.IntStream;

public class JustPract {

    public static void main(String[] args){

        int[] arr = new int[]{1,2,4,3,2,5,0};

        int[] arr1=IntStream.of(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

        Set<Integer> set = new HashSet<>();
        //set.stream().flatMapToInt(i->i).toArray();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){

        }

        Map<String,String> map = new HashMap<>();
        System.out.println(map.getOrDefault("Apple","Can't find the value for 1"));
        Integer a = 10;
        a.intValue();

        Map<Character,Integer> map2= new HashMap<>();
        map2.put('c',1);
        map2.put('d',3);

        System.out.println(map2.get('c').compareTo(-2));
        for(int i : map2.values()){
            System.out.println(i);
        }

    }
}
