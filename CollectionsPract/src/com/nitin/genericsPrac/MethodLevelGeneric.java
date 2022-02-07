package com.nitin.genericsPrac;

public class MethodLevelGeneric {

    public <T> void method1(T t){

    }

    public <T extends Runnable> void method2(T t){

    }

    public <T extends Runnable&Comparable> void  method3(T t){

    }
}
