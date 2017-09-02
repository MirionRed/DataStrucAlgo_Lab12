/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import Part1.*;
import java.util.Random;

/**
 *
 * @author Red King
 */
public class UseMergeSort {

    public static void main(String[] args) {
        int key = 0;
        MergeSort ms = new MergeSort();
        Random rand = new Random();
        int[] numbers = new int[20];
        System.out.print("Input: ");
        for (int i = 0; i < numbers.length; i++) {
            int num = rand.nextInt(101);
            System.out.print(num + ", ");
            numbers[i] = num;
            if (i == 10) {
                key = num;
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 20; i++) {
            ms.tree.add("Row " + (i + 1) + ": ");
        }
        System.out.println();
        ms.mergeSort(numbers, 0);
        ms.printTree();
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();
        System.out.println("Key to find: " + key);
        BinarySearch bs = new BinarySearch();
        System.out.println("Result: " + bs.binarySearch(numbers, key));
    }
}
