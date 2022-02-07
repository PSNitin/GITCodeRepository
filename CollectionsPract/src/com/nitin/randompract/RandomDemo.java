package com.nitin.randompract;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args){

        Random obj = new Random();

        int x = obj.nextInt();
        System.out.println(x);

        int y = obj.nextInt(50);
        System.out.println(y);
    }
}
