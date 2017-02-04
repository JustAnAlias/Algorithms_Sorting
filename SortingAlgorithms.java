/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_assignment1_sorting;

import java.util.Arrays;

/**
 * 
 *
 * @author RL
 */
public class SortingAlgorithms {

    public static void insertSort(String[] arr) {
        for (int j = 1; j < arr.length; j++) {
            String key = arr[j];
            int i = j - 1;
            while (i >= 0) {
                if (key.compareTo(arr[i]) > 0) {
                    break;
                }
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void mergeSort(String[] arr) {
        if (arr.length > 1) {
            // split array into two halves
            String[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
            String[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            
            // run recursive
            mergeSort(left);
            mergeSort(right);
            
            // merge sorted halves
            merge(arr, left, right);
        }
    }

// Merges left and right arrays into result array.  
    public static void merge(String[] arr, String[] left, String[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1].compareTo(right[i2]) <= 0)) {
                arr[i] = left[i1];
                i1++;
            } else {
                arr[i] = right[i2];
                i2++;
            }
        }
    }

}
