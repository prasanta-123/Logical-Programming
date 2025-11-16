package Intervieew;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//        String  str1="cat";
//        String str2="act";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first character");
        String str1 = sc.nextLine();
        System.out.println("enter second  character");

        String str2 = sc.nextLine();
     char a []  = str1.toCharArray();
     char b []  = str2.toCharArray();
     Arrays.sort(a);
     Arrays.sort(b);

     if (Arrays.equals(a,b)){
         System.out.println("this is an anagram");
     }
     else {
         System.out.println("this is not an anagram");
     }



    }
}