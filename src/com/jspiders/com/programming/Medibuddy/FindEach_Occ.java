package com.jspiders.com.programming.Medibuddy;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindEach_Occ {

        public static void main(String[] args) {
            String str = "ababba";
            Map<Character, Integer> map = new LinkedHashMap<>();

            // Count characters
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // Print result
            map.forEach((k, v) -> System.out.print("" + k + v));
        }
    } 


