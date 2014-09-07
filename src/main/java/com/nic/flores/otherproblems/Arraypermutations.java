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
public class Arraypermutations {

    public String printArray(int[] x) {
        return Arrays.toString(x);
    }
    
    public void permArray(int[] x) {
        permSubArray(x,0, x.length);
    }
    
    public void permSubArray(int[] x, int a, int b) {
        if ( a == b) {
            System.out.println(Arrays.toString(x));
        }
        for (int i = a; i < b; i++) {
            swap(x,a,i);
            permSubArray(x,a+1,b);
            swap(x,i,a);
        }
    }
     
    public void swap(int[] x, int a, int b) {
        int temp = x[b];
        x[b] = x[a];
        x[a] = temp;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arraypermutations ap = new Arraypermutations();
        int[] myarray = {1,2,3};
        ap.permArray(myarray);
        //System.out.println(ap.printArray(myarray));
        
        
    }
    
}
