package com.nitin.streampract;

import java.util.Scanner;

public class CoPrimePract {

    public static void main(String[] args){

        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            int temp =num2;
            num2=num1;
            num1=temp;
        }

        for(int i=2; i<=num1;i++)
        {
            if(num1%i==0 && num2%i==0){
                System.out.println(num1 +" and "+num2+" are not co prime");
                return;
            }
        }
        System.out.println(num1 +"and "+num2+" are co prime");
    }
}
