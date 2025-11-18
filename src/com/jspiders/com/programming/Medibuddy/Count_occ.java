package com.jspiders.com.programming.Medibuddy;

import java.util.HashMap;

public class Count_occ {
    public static void main(String[] args) {
        int a[]={1,2,4,5,3,2,2,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int x:a){
            map.put(x, map.getOrDefault(x,0)+1);

        }
        System.out.println(map);
    }
}
