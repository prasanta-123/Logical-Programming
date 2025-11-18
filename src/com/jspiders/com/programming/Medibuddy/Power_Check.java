package com.jspiders.com.programming.Medibuddy;

import java.util.Scanner;

public class Power_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println("enter base");
        int base=sc.nextInt();
        int temp=n;
        while (temp % base ==0){
            temp=temp/base;

        }
        if (temp==1){
            System.out.println(n+"is a power of"+base);
        }
        else {
            System.out.println(n+"is not a power of"+base);
        }

    }
}
