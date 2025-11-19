package Intervieew;

public class Check_String_palindrom {
    public static void main(String[] args) {
        String str="mada m";
        System.out.println(ispalindrom(str));


    }
    public static boolean ispalindrom(String str){
        String rev="";
        String  org=str;
        int len=str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if (org.equals(rev)){
            return true;

        }

     return false;

    }


}