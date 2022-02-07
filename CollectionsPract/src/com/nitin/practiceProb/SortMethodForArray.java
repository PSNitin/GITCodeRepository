package com.nitin.practiceProb;

import java.util.Arrays;
import java.util.Scanner;

public class SortMethodForArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        String sortedArr[] = sortArray(n, arr);

        for (String word : sortedArr)
            System.out.print(word + " ");

    }

    private static String[] sortArray(int n, String[] arr) {

        Arrays.sort(arr);
        return arr;
    }
}
