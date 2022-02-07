package com.nitin.practiceProb;

import java.util.*;

public class FindFrequentTemp {

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(sc.next());
            }

            int ans = mostRepeatedTemperature(n, a);
            System.out.println(ans);

}

    private static int mostRepeatedTemperature(int n, int[] a)
    {
        Map<Integer,Integer> tempMap = new HashMap<>();
        int maxKey=Integer.MIN_VALUE;
        for(int temp : a){

            if(tempMap.containsKey(temp)){
                tempMap.replace(temp,tempMap.get(temp)+1);
            }else{
                tempMap.put(temp,1);
            }
        }
        int count=0;
        for(Integer key : tempMap.keySet()){
            if(count==0){
                maxKey=key;
                count++;
            }else{
                maxKey= (tempMap.get(key)>=tempMap.get(maxKey))? (tempMap.get(key)>tempMap.get(maxKey)?key:(key>maxKey)?key:maxKey):maxKey;
            }
        }

        return maxKey;
    }

    }
