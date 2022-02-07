package com.nitin;

import java.util.*;

public class LeaderList {

    public static void main(String[] args){

        int[] arr = new int[]{0, -1, -29, 3, 2};
        System.out.println("Input array is :"+ Arrays.toString(arr));
        
        System.out.println("Leader list is :"+ leaderList(arr));
    }

    private static List leaderList(int[] numbers) {

        ArrayList<Integer> arr = new ArrayList<>();

        int sum=0;
        for(int i=numbers.length-1;i>=0;i--){

            if(i==numbers.length-1){
                if(numbers[i]>0){
                    arr.add(Integer.valueOf(numbers[i]));
                }
            }else if(numbers[i]>sum){
                arr.add(Integer.valueOf(numbers[i]));
            }
            sum=sum+numbers[i];
        }
        Collections.reverse(arr);


        return arr;
    }
}
