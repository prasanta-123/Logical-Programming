package Intervieew;

public class vowel_consonants {
    public static void main(String[] args) {
        String str="i love java";
       //str= str.toLowerCase();
        
        int ccount=0;
        int vcount=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vcount++;
                
            } else if (str.charAt(i)>'a'&& str.charAt(i)<='z') {
                ccount++;
                
            }
        }
        System.out.println("vowel"+vcount);
        System.out.println("consonant"+ccount);


    }
}
