package com.nic.flores;


public class Problem4 {

   private int getNthDigit(int x, int n) {
	return (x / (int) Math.pow(10,n)) % 10;
   }

   private int countDigits(int x) {
	int temp = x;
	int i = 0;
	while ( temp != 0 ) {
		temp /= 10;
		i++;
	}
	return i;
   }

   private boolean isPalindromic(int x) {
	int len = countDigits(x);
	int i = 0;
	while (i < len-1) {
		if (getNthDigit(x,i) == getNthDigit(x,(len-1) - i)) {
			i++;
		} else {
			return false;
		}
	}
	return true;
   }


   public int getLargestPalindrome(int x) {
     int result = 0;
     int prod = 0;
     for (int i = x; i > 0; i--) {
       for (int j = x; j > 0; j--) {
         prod = i*j;
         if (isPalindromic(prod) && prod > result) {
           result = prod;
         }
       }
     }
     return result;
   }

    public static void main (String[] args) {
	Problem4 p4 = new Problem4();
	System.out.println(p4.getLargestPalindrome(999));
    }
}
