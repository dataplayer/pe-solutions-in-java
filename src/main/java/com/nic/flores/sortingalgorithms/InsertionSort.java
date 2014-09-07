package sortingalgorithms;

import java.util.Arrays;

/**
 * Created by nicflores on 9/5/14.
 */
public class InsertionSort {

    public void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for (int k = i; k > 0 && arr[k] < arr[k-1]; k--) {
                swap(arr,k,k-1);
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("I'm Insertion Sort!");

        InsertionSort sorter = new InsertionSort();

        int[] myarray = {5,6,2,3,7,4,1};
        int[] myarray = {4,2,3,1};


        System.out.println(Arrays.toString(myarray));

        sorter.sort(myarray);

        System.out.println(Arrays.toString(myarray));

    }
}
