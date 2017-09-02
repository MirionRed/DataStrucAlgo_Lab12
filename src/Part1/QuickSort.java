/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author Red King
 */
public class QuickSort {

    public static void main(String[] args) {
        new QuickSort(1);
    }

    public QuickSort(int num) {
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        quickSort(numbers);
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public QuickSort() {

    }

    public void quickSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        quickSort(list, 0, list.length - 1);
    }

    private void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /**
     * Partition the array list[first..last]
     */
    private int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1; // Index for forward search
        int high = last; // Index for backward search
        System.out.println("pivot: " + pivot);
        while (high > low) {
            // Search forward from left
            System.out.print("Low: " + list[low] + " ");
            while (low <= high && list[low] <= pivot) {
                low++;
                if(low < list.length)
                    System.out.print(list[low] + " ");
            }
            System.out.println();
            // Search backward from right
            System.out.print("High: " + list[high] + " ");
            while (low <= high && list[high] > pivot) {
                high--;
                System.out.print(list[high] + " ");
            }
            System.out.println();
            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;

                for (int i = 0; i < list.length; i++) {
                    System.out.print(list[i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("Pivot change: " + list[high]);
        while (high > first && list[high] >= pivot) {
            high--;
            System.out.println("Pivot change: " + list[high]);
        }

        // Swap pivot with list[high]
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();

            return high;
        } else {
            return first;
        }

    }

}
