package Intervieew;

//SDET  SOURCE....

public class Reverse_Each_Words {
    public static void main(String[] args) {
        String str="Welcome back java";
        String [] Words= str.split(" ");
        String reverseWord="";
        for (String w:Words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord=reverseWord + sb.toString()+" ";


        }
        System.out.println(reverseWord);
    }
}
