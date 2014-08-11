package com.nic.flores;

import java.util.Arrays;
import java.util.Vector;

public class Intersection {

  public Intersection() {

  }


  /**
   * <p>Compute the intersection of two sets.</p>
   * 
   * <p>
   *   The running time is O(n*log(n) + m*log(m)) and in the process,
   *   a and b will be sorted.
   * </p>
   * 
   * @param a An array of ints, will be sorted in place.
   * @param b An array of ints, will be sorted in place.
   * 
   * @returns An array containing the intersection of a and b.
   */
  public Object[] getIntersection(int[] a, int[] b) {
    Vector<Integer> result = new Vector<Integer>(Math.max(a.length,b.length));
    Arrays.sort(a);
    Arrays.sort(b);
    int i = 0;
    int j = 0;
    while ( i < a.length && j < b.length ) {
      if ( a[i] < b[j] ) {
        i++;
      } else if ( a[i] > b[j] ) {
        j++;
      } else { //a[i] == b[j]
        result.add(a[i]);
        i++;
        j++;
      }
    }
    return result.toArray();
  }

    public static void main (String[] args) {
	int[] seta = {72,44,52,27,0,24,84,41,14};
	int[] setb = {7,414,52,70,3,124,74,42,14,8,32,13,43};
	Intersection intersection = new Intersection();
	System.out.println(intersection.getIntersection(seta,setb));

   }
}
