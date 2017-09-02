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
public class SelectionSort {

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;

                for (int num: list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        selectionSort(numbers);
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
