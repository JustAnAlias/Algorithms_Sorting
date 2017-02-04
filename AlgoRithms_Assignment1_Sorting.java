/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms_assignment1_sorting;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author RL
 */
public class AlgoRithms_Assignment1_Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String[] words = FileUtility.toStringArray("C:\\Users\\RL\\Documents\\NetBeansProjects\\AlgoRithms_Assignment1_Sorting\\src\\algorithms_assignment1_sorting\\shakespeare-complete-works.txt", "[^A-Za-z]");

        // LimitArray to test sorting works
        // Wordlist, startword, endword
        String[] limitArray = Arrays.copyOfRange(words, 0, 1000);

        // Merge Sort
        long mergeStartTime = System.nanoTime();
        SortingAlgorithms.mergeSort(words);
        long mergeEndTime = System.nanoTime();
        System.out.println("MergeSort took: " + ((mergeEndTime - mergeStartTime) / 1_000_000) + " ms");

        // Insertion Sort
        long insStartTime = System.nanoTime();
        SortingAlgorithms.insertSort(words);
        long insEndTime = System.nanoTime();
        System.out.println("InsertionSort took: " + ((insEndTime - insStartTime) / 1_000_000) + " ms");

        // Selection Sort
        long selStartTime = System.nanoTime();
        SortingAlgorithms.selectionSort(words);
        long selEndTime = System.nanoTime();
        System.out.println("SelectionSort took: " + ((selEndTime - selStartTime) / 1_000_000) + " ms");

        // Printing limitArray to see if sorting works.
//    for(String string : words) {
//       System.out.println(string);
//    }
    }

}
