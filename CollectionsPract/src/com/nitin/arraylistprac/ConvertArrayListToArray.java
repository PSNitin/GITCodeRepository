package com.nitin.arraylistprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayListToArray {

    public static void main(String[] args){

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Nitin");
        arrList.add("Nishant");

        System.out.println(arrList.toString());

        String[] arr = new String[arrList.size()];
        arr = arrList.toArray(arr);

        System.out.println(Arrays.toString(arr));

        //convert back to ArrayList

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(arrayList1.toString());

        Collections.sort(arrayList1);
    }
}
