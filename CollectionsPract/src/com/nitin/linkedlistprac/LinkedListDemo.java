package com.nitin.linkedlistprac;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){

        Object[] objs = new Object[1000000];

        for(int i=0;i<1000000;i++){
            objs[i]= new Object();
        }

        LinkedList<Object> linkedList = new LinkedList<>();
        long starttime = System.currentTimeMillis();
        for(Object obj : objs){
            linkedList.add(obj);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken :" + (endTime-starttime));

    }
}
