package com.nic.flores;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Tests for {@link Problem1}.
 *
 * @author nic@flores.com (Nic Flores)
 */
public class ProblemTest {

    @Test
    public void testProblem1() {
	Problem1 p1 = new Problem1();
	Assert.assertEquals("must be 23", 23, p1.sumOfMultiples(10));
    }

    @Test
    public void testProblem2() {
	Problem2 p2 = new Problem2();
	Assert.assertEquals("must be 44", 44, p2.getSumOfEvenFibb(10));
    }

    @Test
    public void testProblem3() {
	Problem3 p3 = new Problem3();
	Assert.assertEquals("must be 29", 29L, p3.getLargestPrimeFactor(13195L));
    }

    @Test
    public void testProblem4() {
	Problem4 p4 = new Problem4();
	Assert.assertEquals("must be 9009", 9009, p4.getLargestPalindrome(99));
    }
}

