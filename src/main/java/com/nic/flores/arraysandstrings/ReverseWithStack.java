/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flores.nic;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author nicflores
 */
public class ReverseWithStack {
    
    /**
     * Reverse an int array using a stack.
     * 
     * Runs in O(n).
     * @param arr 
     */
    public void reversewithstack(int[] arr) {
        Stack stack = new Stack();
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while(!stack.empty()) {
            arr[j] = (int) stack.pop();
            j++;
        }   
    }
    
    public static void main(String[] arg) {
        ReverseWithStack rws = new ReverseWithStack();
        int[] myarray = {1,2,3};
        rws.reversewithstack(myarray);
        System.out.println(Arrays.toString(myarray));
    }
}
