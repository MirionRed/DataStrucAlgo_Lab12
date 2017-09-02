/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Red King
 */
public class MergeSort {

    public ArrayList<String> tree = new ArrayList<String>();
    public int rowCount = 0;
    public int mergeRowCount = 0;

    public void addArray(String newArray, int row) {

        if (rowCount <= row) {
            ++rowCount;
            mergeRowCount = rowCount;
        }

        String word = tree.get(row) + newArray;
        tree.set(row, word);
    }

    public void addMergeArray(String newArray, int row) {
        int rowNum = mergeRowCount * 2 - row;
        String word = tree.get(rowNum) + newArray;
        tree.set(rowNum, word);
    }

    public void printTree() {
        for (int i = 0; i < tree.size(); i++) {
            System.out.println(tree.get(i));
        }
    }

    public void mergeSort(int[] list, int row) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

            addArray(Arrays.toString(firstHalf), row);
            mergeSort(firstHalf, row + 1);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);

            addArray(Arrays.toString(secondHalf), row);
            mergeSort(secondHalf, row + 1);

            merge(firstHalf, secondHalf, list, row + 1);
            //System.out.println("Row: " + (mergeRowCount + row) + ". After - ");
            //System.out.println(Arrays.toString(list));
        }
    }

    /**
     * Merge two sorted lists
     */
    public void merge(int[] list1, int[] list2, int[] temp, int row) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2]) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length) {
            temp[current3++] = list1[current1++];
        }
        while (current2 < list2.length) {
            temp[current3++] = list2[current2++];
        }
        addMergeArray(Arrays.toString(temp), row);
    }
    
    public MergeSort(){
        
    }
    
    public MergeSort(int num){
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < 10; i++) {
            tree.add("Row " + (i + 1) + ": ");
        }
        System.out.println();

        mergeSort(numbers, 0);

        printTree();

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        new MergeSort(1);
    }
}
