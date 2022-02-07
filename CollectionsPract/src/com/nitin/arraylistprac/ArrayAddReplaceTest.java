package com.nitin.arraylistprac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayAddReplaceTest {

    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(Integer.valueOf(60));


        System.out.println(arr.toString());

        arr.add(1,40); // it will insert 40 to index 1 and move remaining objects to the right.
                                    // it is not replacing object
        System.out.println(arr.toString());


        arr.set(1,50);              //It is replacing the objec at index 1 (40) with new object 50.
        System.out.println(arr.toString());

        List<Integer> arr2 = new ArrayList<>();

        arr2.add(11);
        arr2.add(22);
        arr2.add(33);
        arr2.add(44);

        //----Add another list-----
        //arr.addAll(arr2);
        arr.addAll(2,arr2);
        System.out.println(arr2.toString());
        System.out.println(arr.toString());

        //-----check if list contain the element
        System.out.println(arr.contains(33));

        //----size of list----
        System.out.println(arr.size());

        //----TO Remove element
        arr.remove(Integer.valueOf(22));
       // arr.remove(22);  --it take it as index
        arr.remove(1);

        System.out.println(arr.toString());

        //Iterator in list
        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("After itrator :"+arr);
    }
}
