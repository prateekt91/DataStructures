package com.sorting;

/**
 * @author Prateek
 */
public class ShellSort {

    public int[] sort(int[] array) {

        for(int gap = array.length /2; gap > 0; gap /= 2) {

            for(int i= gap; i < array.length; i++) {
                int newElem = array[i];
                int j = i;
                while(j>=gap && array[j-gap] > newElem) {
                    array[j] = array[j-gap];
                    j -= gap;
                }
                array[j] = newElem;
            }
        }
        return array;
    }
}
