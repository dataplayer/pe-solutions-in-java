package com.nic.flores;

import java.util.stream.IntStream;

public class Problem1wStreams {

Problem1wStreams() {
}

public int sumOfMultiples(int limit) {

	return IntStream.rangeClosed(1,limit).filter(n -> n % 3 == 0 || n % 5 == 0).sum();

}


public static void main (String[] args) {
	Problem1wStreams p1 = new Problem1wStreams();
	System.out.println(p1.sumOfMultiples(1000));
}

}
