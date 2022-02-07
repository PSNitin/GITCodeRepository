package com.nitin.heapPriorityQ;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RepeatSubstractionInArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    //total time complexity is O(NlogN)
    private static int reduceArray(int n, int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:a){
            pq.add(i);
        }
        //this loop go for n times
        while(pq.size()>1){

            int largest = pq.poll().intValue(); //log(n)
            int secLargest= pq.poll().intValue();//log(n)
            pq.add(largest-secLargest);

        }

        return pq.poll();
    }
}
