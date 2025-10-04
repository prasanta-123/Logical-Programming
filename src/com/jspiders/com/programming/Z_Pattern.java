package com.jspiders.com.programming;

import java.util.Scanner;

public class Z_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int row=1;row<=num;row++){
            for (int col=1;col<=num;col++){
                if (row==1|| row+col==num+1||row==num){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
}
