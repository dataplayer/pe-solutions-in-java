/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flores.nic;

import java.util.Arrays;

/**
 *
 * @author nicflores
 */
public class ReverseCstring {
    
    
    
       
    /**
     *  In-please reversal of a char array terminating
     *  in a null char. This is how c-string are represented.
     * 
     *  @param arr a char to be reversed
     */
     public void ReverseCstring(char[] arr) {
        int originptr = arr.length - 2;
        int destptr = 0;
        while (destptr < originptr) {
           char temp = arr[originptr];
           arr[originptr] = arr[destptr];
           arr[destptr] = temp;
           originptr--;
           destptr++;
        }
    }
    
    /**
     * Same as above except that we return a new instance
     * of a char array.
     * 
     * @param arr
     * @return 
     */
    public char[] ReverseCstringNonMutable(char[] arr) {
        char[] result = new char[arr.length];
        int originptr = arr.length - 2;
        int destptr = 0;
        while (originptr >= 0) {
            result[destptr++] = arr[originptr--];
        }
        return result;
    }
    
    public static void main(String[] arg) {
        char[] myarray = {'a','b','c','d','\0'};
        ReverseCstring rcstr = new ReverseCstring();
        rcstr.ReverseCstring(myarray);
        System.out.println(Arrays.toString(myarray));
        char[] myarrayrev = rcstr.ReverseCstringNonMutable(myarray);
        System.out.println(Arrays.toString(myarrayrev));
    }
}
