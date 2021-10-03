package com.nitin.sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumOfTwoNum2 {

	public static void main(String[] args) {
		int[] array;
		int [] output;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int len = in.nextInt();
		array = new int[len];
		System.out.println("Enter the array elements :");
		for(int i=0;i<len;i++) {
			array[i]=in.nextInt();
		}
		System.out.println("Enter the targetSum :");
		int targetSum =in.nextInt();
		in.close();
		output= twoNumber(array,targetSum);
		System.out.println("Output is :"+ Arrays.toString(output));
	}

	public static int[] twoNumber(int[] array, int target) {
		
		Set<Integer> num = new HashSet<>();
		for(int i : array) {
			int potentialSum = target-i;
			if(num.contains(i)) {
				return new int[]{i,potentialSum};
			}else {
				num.add(potentialSum);
			}
		}
		
		return new int[0];
	}
}
