package com.nitin.streampract;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,32,1,435};

        System.out.println(Arrays.stream(arr2).sum()+Arrays.stream(arr1).sum());
    }
}
