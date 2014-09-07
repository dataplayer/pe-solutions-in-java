package com.flores.nic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicflores
 */
public class Problem1p4 {
    
    public boolean areanagrams(String a, String b) {
        int[] asciia = new int[256];
        int[] asciib = new int[256];

        boolean result = true;
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            asciia[a.charAt(i)] += 1;
            asciib[b.charAt(i)] += 1;
        }
        for (int i = 0; i < asciia.length; i++) {
            if (asciia[i] != asciib[i])
                result = false;
        }
        return result;     
    }
    
    public static void main(String[] str) {
        System.out.println("Write a method that decides if two strings are anagrams or note");
        Problem1p4 p1p4 = new Problem1p4();
        String a = "aabb";
        String b = "aaaa";
        System.out.println(p1p4.areanagrams(a, b));
        
        
    }
}
