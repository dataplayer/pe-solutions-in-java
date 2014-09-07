package datastructures;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by nicflores on 8/24/14.
 */
public class ArraysAndStrings {

    /*
     *  Using and implementing hash tables example
     */
    public HashMap<Integer,String> buildMap( String[] strings ) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        for (String s : strings) map.put(s.length(),s);
        return map;
    }

    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }

    public static void main (String[] args) {
        System.out.println("hello arrays and strings!");

        ArraysAndStrings test = new ArraysAndStrings();
        String[] mystrings = {"stuff","hi","unusual"};
        String[] extrastrings = {"things","hello","simple","table"};

        System.out.println(test.buildMap(mystrings));
        System.out.println(test.merge(mystrings,extrastrings));

    }
}
