package com.jspiders.com.programming.Medibuddy;

public class Common_Sorted_Arr {
    public static void main(String[] args) {


        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};

        int i = 0, j = 0, k = 0;

        System.out.println("Common elements:");

        while (i < a.length && j < b.length && k < c.length) {


            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            }

            // Move the pointer of the smallest element
            else if (a[i] < b[j]) {
                i++;
            }
            else if (b[j] < c[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
}


