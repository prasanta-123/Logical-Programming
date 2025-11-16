package Intervieew;

public class count_char_String {
    public static void main(String[] args) {
        String str="hii every ";
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!= ' '){
                count++;

            }
        }
        System.out.println("total number of character in the string are  =>" + count);
    }
}
