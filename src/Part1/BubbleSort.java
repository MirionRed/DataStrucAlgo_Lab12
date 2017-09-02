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
public class BubbleSort {

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                    
                    /*
                    for (int num : list) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    */
                }
            }
            
            //if you want more detail movement of the array 
            //uncomment the section above
            //and comment out the bottom section
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {44, 78, 22, 7, 38, 56, 34, 2, 98, 35, 45};
        bubbleSort(numbers);
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
