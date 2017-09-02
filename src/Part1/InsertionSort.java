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
public class InsertionSort {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];

                for (int a = 0; a < list.length; a++) {
                    if (a == k) {
                        System.out.print(currentElement + " ");
                    } else {
                        System.out.print(list[a] + " ");
                    }
                }
                System.out.println();
            }
            list[k + 1] = currentElement;

        }
    }

    public static void main(String[] args) {
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        insertionSort(numbers);

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
