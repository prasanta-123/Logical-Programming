package Intervieew;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_Duplicate_Arr {
    public static void main(String[] args) {
        int a[]={1,4,5,50,70,4,3,5};
        System.out.println("before removing"+ Arrays.toString(a));
        
        LinkedHashSet s=new LinkedHashSet();
        for (int x:a){
            s.add(x);
        }
        System.out.println("after removing "+s);
    }
}
