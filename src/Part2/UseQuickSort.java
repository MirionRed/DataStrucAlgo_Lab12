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
public class UseQuickSort {
    public static void main(String[]args){
        QuickSort qs = new QuickSort();
        Random rand = new Random();
        int key = 0;
        int[] numbers = new int [20];
        System.out.print("Input: ");
        for(int i = 0; i < numbers.length; i++){
            int num = rand.nextInt(101);
            System.out.print(num + ", ");
            numbers[i] = num;
            if(i == 10){
                key = num;
            }
        }
        
        System.out.println("\n");
        
        qs.quickSort(numbers);
        
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
