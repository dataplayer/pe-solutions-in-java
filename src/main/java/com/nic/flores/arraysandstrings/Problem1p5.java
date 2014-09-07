/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flores.nic;

/**
 *
 * @author nicflores
 */
public class Problem1p5 {
    
    public String easyreplace(String str) {
        return str.replaceAll(" ", "%20");
    }
    
    
    public String forloopreplace(String str, String tobereplaced, String replacement) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 0; i++) {
            if (str.charAt(i) == tobereplaced) {
                result.append(replacement);
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        Problem1p5 p1p5 = new Problem1p5();
        String res = p1p5.easyreplace(str);
        System.out.println(res);
    }
}
