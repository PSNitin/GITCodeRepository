package com.nitin.arraylistprac;

import java.util.ArrayList;
import java.util.List;

public class ListOFList {

    public static void main(String[] args){

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        System.out.println(list.size());
        List<Integer> tempList = new ArrayList<>();
        list.add(tempList);
        System.out.println(list.size());
        list.get(0).add(10);
        System.out.println(list.get(0).get(0));


    }
}
