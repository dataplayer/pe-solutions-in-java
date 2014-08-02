package com.nic.flores;


public class Problem1 {

Problem1() {
}

public int sumOfMultiples(int limit) {
  int i = 0;
  int result = 0;
  while ( i != limit ) {
    if ( i % 3 == 0 | i % 5 == 0 ) {
      result += i;
    }
    i++;
  }
  return result;
}


public static void main (String[] args) {
	Problem1 p1 = new Problem1();
	System.out.println(p1.sumOfMultiples(1000));
}

}
