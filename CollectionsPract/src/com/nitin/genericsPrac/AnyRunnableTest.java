package com.nitin.genericsPrac;

public class AnyRunnableTest {

    public static void main(String[] args){

        //AnyRunnable<Thread> t = new AnyRunnable<>();
        //AnyRunnable<String> st = new AnyRunnable<>(); //you will get bound mismatch for this as String is not
                                                         // extends Runnable
        AnyRunnable<MyClass> t = new AnyRunnable<>();
    }
}
