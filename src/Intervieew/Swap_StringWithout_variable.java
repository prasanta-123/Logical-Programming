package Intervieew;

public class Swap_StringWithout_variable {
    public static void main(String[] args) {
        String str1="java";
        String str2="programming";
        System.out.println("before swapping");
        System.out.println("str1 => " +str1);
        System.out.println("str2 => " +str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());//java
        str1=str1.substring(str2.length());
        System.out.println("after swapping");
        System.out.println("str1 => " +str1);
        System.out.println("str2 => " +str2);


    }
}
