package com.nitin.genericsPrac;

import java.util.ArrayList;

public class WildCardParams {

    public static void main(String[] args){
        WildCardParams wcp = new WildCardParams();
        //wcp.myMethod(new ArrayList<String>()); //it give error as String didn't extend Thread
       // wcp.myMethod(new ArrayList<MyClass>());
        wcp.myMethod(new ArrayList<A>());
    }

    //public void myMethod(ArrayList<? extends Thread> l)
    public void myMethod(ArrayList<? super B> l){
        l.add(null);
        //l.add("Nitin");
        l.add(new B());
    }
}
