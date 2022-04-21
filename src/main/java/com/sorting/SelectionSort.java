package com.sorting;

/**
 * @author Prateek
 */
public class SelectionSort {

    // takes array to swap and the indices of the position to swap
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
            int largest = 0;
            for(int i=0; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array,largest,lastUnsortedIndex);
        }
        return  array;
    }
}
