package Intervieew;

public class Reverse_String {
    public static void main(String[] args) {
        String str="prasanta";
      String rev="";

//                                  1.using Stringbuffer
//        StringBuffer sb=new StringBuffer(str);
//        System.out.println("reverse output:"+sb.reverse());


                           //2.using concatnation operator and charat();
//       int len=str.length();
//       for (int i=len-1;i>=0;i--){
//           rev=rev+str.charAt(i);
//       }
//        System.out.println(rev);

//                                 3.by using character array.
        char a[]=str.toCharArray();
       int len = a.length;
       for(int i=len-1;i>=0;i--){
           rev=rev+a[i];
       }
        System.out.println("reverse _"+rev);




    }
}
