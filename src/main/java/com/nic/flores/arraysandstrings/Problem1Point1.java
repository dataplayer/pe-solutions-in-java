package arraysandstrings;

import java.util.Arrays;

/**
 * Created by nicflores on 8/24/14.
 */
public class Problem1Point1 {

    /*
     *  Iterates through string checking if a letter
     *  is contained in the rest of the string.
     *  Stops once the first instance of
     *
     *  runs in O(n^2) time
     *
     *  @args: s the string to be tested
     *
     */
    public boolean arecharsquniein(String s) {
        for (int i = 0; i < s.length(); i++) {
            String test = String.valueOf(s.charAt(i));
            String rest = s.substring(i+1, s.length());

            if (rest.contains(test)) {
                return true;
            }
        }
        return false;
    }

    /*
     *  Turns string into a char array in order to sort it.
     *  Then iterates through char array to find if consecutive
     *  entries are equal.
     *
     *  best case runs in O(n log n)
     *  worst case runs in O(n)
     *
     *  @args: s the string to be tested
     *
     */
    public boolean arecharsqunieinwithds(String s) {
        char[] chararray = s.toCharArray();
        Arrays.sort(chararray);
        for (int i = 0; i < chararray.length - 1; i++) {
            if (chararray[i] == chararray[i+1]) {
                return true;
            }
        }
        return false;
    }

    /*
     *  Uses a poormans hashmap to determine which
     *  ascii chars have been seen. The array index
     *  are the keys and the values are the booleans
     *  at each index.
     *
     *  runs in O(n)
     *
     *  @args: s the string to be tested
     *
     */
    public boolean isUnqiueChars(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main (String[] sargs) {

        Problem1Point1 p1p1 = new Problem1Point1();
        String mystring = "stuff";
        boolean allcharsunique = p1p1.isUnqiueChars(mystring);

        if (allcharsunique) {
            System.out.println("All the chars in " + mystring + " ARE unique!");
        } else {
            System.out.println("NOT all chars in " + mystring + " are unique!" );
        }

    }
}
