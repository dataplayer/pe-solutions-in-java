/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flores.nic;

import java.util.Stack;

/**
 *
 * @author nicflores
 */
public class TrelloProblem {
    
    private final String letters = "acdegilmonprstuw";
    
    public long hash(String s) {
        long h = 7L;
        for (int i = 0; i < s.length(); i++) {
            h = h * 37 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
    
    
    /**
     * 
     * Unhashes a long produced by the above method.
     * 
     * @param num: a long that will be unashed
     * @return a string that when hashed produces the parameter num
     */
    public String unhash(long num) {
        // used to store hashed chars from the letters above
        // allows to print letters in a readable order
        Stack stack = new Stack();
        
        // a place to store the letters read out of the stack
        StringBuilder result = new StringBuilder();
        
        // meat of solution
        // this undoes (prev iteration) * 37 + letter.index()
        // and pushes the letter found from the remainder to the stack
        while(num > 37) {
            long remainder = num % 37;
            stack.push(letters.charAt((int) remainder));
            // div by 37 undes the previous iteration in the for look of the 
            // hash function
            num /= 37;
        }
        
        // iterate the stack and append to string builder instance
        while (!stack.empty()) {
            result.append(stack.pop()) ;
        }
        return result.toString();
    }
    
    public static void main(String[] arg) {
        TrelloProblem tp = new TrelloProblem();
        long unhashme = 956446786872726L;
        //long result = tp.hash("ab");
        //System.out.println(result);
        String str = tp.unhash(unhashme);
        System.out.println(str);
    }
}
