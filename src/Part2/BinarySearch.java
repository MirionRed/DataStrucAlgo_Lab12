/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

import Part1.QuickSort;

/**
 *
 * @author Red King
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        QuickSort qs = new QuickSort();
        qs.quickSort(numbers);
        BinarySearch bs = new BinarySearch();

        int[] key = {35, 56, 45, 60};
        for (int i = 0; i < key.length; i++) {
            System.out.println();
            System.out.println("Key to find: " + key[i]);
            System.out.println("Result: " + bs.binarySearch(numbers, key[i]));
        }
    }

    public BinarySearch() {
    }

    public int binarySearch(int[] list, int key) {
        int count = 1;
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {

            int mid = (low + high) / 2;
            System.out.println("Low: " + list[low]
                    + " High: " + list[high] + " Mid: " + list[mid]);
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                System.out.println("Step: " + count);
                return list[mid];
            } else {
                low = mid + 1;
            }

            count++;
        }
        System.out.println("Low: " + list[low]
                    + " High: " + list[high] + " Mid: " + (-low - 1));
        System.out.println("Step: " + count);
        return -low - 1;
    }
}
