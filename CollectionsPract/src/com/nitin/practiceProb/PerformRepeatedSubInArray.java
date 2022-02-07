package com.nitin.practiceProb;

import java.util.*;

public class PerformRepeatedSubInArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    private static int reduceArray(int n, int[] a) {

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: a){
            queue.offer(i);
        }
        while (queue.size()>1){

            queue.offer(queue.poll()-queue.poll());
        }

        return queue.poll();
    }

}
