package com.nitin.genericsPrac;

public class TestGeneric {

    public static void main(String[] args){

        MyGenericClass<String> s = new MyGenericClass<>("Nitin");
        s.displayObjDetail();
        System.out.println(s.getObj());

        MyGenericClass<Integer> i = new MyGenericClass<>(10);
        i.displayObjDetail();
        System.out.println(i.getObj());

        MyGenericClass<Double> d = new MyGenericClass<>(23.23);
        d.displayObjDetail();
        System.out.println(d.getObj());

    }
}
