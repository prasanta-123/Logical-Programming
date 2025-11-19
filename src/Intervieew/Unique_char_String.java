package Intervieew;

import java.util.Scanner;

public class Unique_char_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if (str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println("unique character is" +c);
            }


        }



    }
}
