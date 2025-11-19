package Intervieew;

import java.util.Scanner;

public class String_palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str= sc.nextLine();
        String org=str;
        String rev="";
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if (org.equals(rev)){
            System.out.println(org+" is a palindrom ");
        }
        else {
            System.out.println(org + " is  not a palindrom ");
        }

    }
}
