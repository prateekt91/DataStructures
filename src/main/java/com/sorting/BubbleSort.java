package com.sorting;

/**
 * @author Prateek
 */
public class BubbleSort {

    // takes array to swap and the indecis of the position to swap
    public static void swap(int [] array, int i, int j) {
         if(i == j) {
             return;
         }
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
    }

    public int[] sort(int [] array) {

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
        return  array;
    }
}
