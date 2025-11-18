package com.jspiders.com.programming.Medibuddy;

public class Unique_Element_String {
    public static void main(String[] args) {
        String str="prasanta";
        for (int i=0;i<str.length();i++){
           char a= str.charAt(i);
           if (str.indexOf(a)==str.lastIndexOf(a)){
               System.out.println("unique element are"+" "+a);
           }
        }
    }
}
