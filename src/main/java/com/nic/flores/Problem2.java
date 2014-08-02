package com.nic.flores;

public class Problem2 {

public Problem2() {

}


public int getSumOfEvenFibb(int limit) {
  //int limit = 4000000;
  int result = 0;
  int fn_1 = 0;
  int fn_2 = 1;
  int current = 0;
  while ( current < limit ) {
    current = fn_1 + fn_2;
    if ( current % 2 == 0 ) {
      result += current;
    }
    fn_1 = fn_2;
    fn_2 = current;
  }
  return result;
}

public static void main (String[] args) {
  Problem2 p2 = new Problem2();
  System.out.println(p2.getSumOfEvenFibb(4000000));
}

}
