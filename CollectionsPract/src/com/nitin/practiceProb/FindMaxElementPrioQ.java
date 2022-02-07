package com.nitin.practiceProb;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMaxElementPrioQ {

    public static void main(String[] args){

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);

        System.out.println(queue.remove());
    }
}
