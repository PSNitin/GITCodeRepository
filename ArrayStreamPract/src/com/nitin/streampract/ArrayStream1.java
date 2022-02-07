package com.nitin.streampract;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream1 {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,23,121,455456756};

        IntStream strm = Arrays.stream(arr);

        strm.forEach(str -> System.out.println(str+" "));

        IntStream strm2 = Arrays.stream(arr);
        System.out.println(strm2.sum());

        //--

        String[] arr1 = {"That's","is","a","way","you","do","it"};

        Stream<String> strm1 = Arrays.stream(arr1,3,6);

        strm1.forEach(st->System.out.println(st));

        //
        int[][] twoDArray = {{1,2},{3,4},{5,6}};


        System.out.println("Sum is "+ Arrays.stream(twoDArray).flatMapToInt(x->Arrays.stream(x)).sum());

        System.out.println("Max is "+ Arrays.stream(twoDArray).flatMapToInt(x->Arrays.stream(x)).max().getAsInt());

        Set<Integer> list = new LinkedHashSet<>();
        list.toArray();
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            itr.next();
        }


    }
}
