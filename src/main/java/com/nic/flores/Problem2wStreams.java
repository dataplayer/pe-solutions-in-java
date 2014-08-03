package com.nic.flores;

import java.util.stream.*;

public class Problem2wStreams {

public Problem2wStreams() {

}

 /**
   * <p>Computes the sum of the even numbers contained in the first n fibinocci numbers.</p>
   * 
   * <p>
   *   The running time is O(n). A stopping number needs to be passed in,
   *   so you must know ahead of time how many numbers in the sequnce you want to process.
   * </p>
   * 
   * @param n An int, that represents the number of fibinocci numbers you wish to process. 
   * 
   * @returns An int representing the sum of the even numbers contained in the first n fibinocci numbers.
   */
public int getSumOfEvenFib(int n) {
	return Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]}).limit(n).filter(t -> t[0] % 2 == 0).map(t -> t[0]).reduce(0,(a,b) -> a+b);

}

public static void main (String[] args) {
  Problem2wStreams p2 = new Problem2wStreams();
  System.out.println(p2.getSumOfEvenFib(34));
}

}
