package com.jspiders.com.programming.Medibuddy;

public class Non_Duplicate_First_occ {
    public static void main(String[] args) {
        String str="swiss";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (str.indexOf(c)== str.lastIndexOf(c)){
                System.out.println("The first non-duplicate character is" +" "+c);
              break;
            }
        }
    }
}
