package com.driver;

import com.sorting.InsertionSort;
import com.sorting.SelectionSort;


/**
 * @author Prateek
 */
public class DriverClass {

    public static void main(String[] args) {

        int[] array = {20,35,-15,7,55,1,-22};

      //  BubbleSort bubbleSort = new BubbleSort();
      //  SelectionSort selectionSort = new SelectionSort();
        //int [] sortedArray = bubbleSort.sort(array);
        InsertionSort insertionSort = new InsertionSort();
        int [] sortedArray = insertionSort.sort(array);
        for(int i = 0; i< sortedArray.length ; i++) System.out.print(sortedArray[i] + " ");


    }
}
