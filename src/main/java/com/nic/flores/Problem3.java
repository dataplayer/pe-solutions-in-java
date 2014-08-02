package com.nic.flores;

import java.util.Queue;
import java.util.LinkedList;

public class Problem3 {

  private Queue<Long> primefactors;
  private Long divisor;

  public Problem3() {
    primefactors = new LinkedList<Long>();
    divisor = 2L;
  }

  public Long getLargestPrimeFactor(Long n) {
    Long result = 0L;

     while ( n > 1 ) {
       while ( n % divisor == 0 ) {
         if ( result < divisor ) { result = divisor; } 
         n /= divisor;
       }
       divisor++;
       // only need to test up to sqrt(n)
       if ( divisor*divisor > n ) {
         if ( n > 1 ) {
	   if ( result < divisor ) { result = n; }
         }
         break;
       }
     }
     return result;
  }


    public static void main (String[] args) {
	Problem3 p3 = new Problem3();
	System.out.println(p3.getLargestPrimeFactor(13195L));
    }
}
