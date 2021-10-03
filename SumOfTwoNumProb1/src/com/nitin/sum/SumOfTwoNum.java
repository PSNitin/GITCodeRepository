package com.nitin.sum;

import java.util.Arrays;
import java.util.Scanner;
//timecomplexity O(nlogn)
public class SumOfTwoNum {

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
		
		Arrays.sort(array);
		int[] output = new int[2]; 
		int low=0;
		int high=array.length-1;
		
		while(low!=high) {
			if(array[low]+array[high]==target) {
				output[0]=array[low];
				output[1]=array[high];
				return output;
			}else if(array[low]+array[high]>target) {
				high--;
			}else if(array[low]+array[high]<target) {
				low++;
			}
		}
		return output;
	}

}
