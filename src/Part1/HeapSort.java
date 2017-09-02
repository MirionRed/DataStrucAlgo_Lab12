/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.ArrayList;

/**
 *
 * @author Red King
 */
public class HeapSort {
    public static void main(String[]args){
        Integer[] list = {44, 66, 33, 88, 77, 55, 22};
        Integer[] numbers = {62,42,59,32,39,44,13,22,29,14,33,30,17,9};
        
        heapSort(list);
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    
    public static <E extends Comparable> void heapSort(E[] list){
        Heap<E> heap = new Heap<E>();
        
        for(int i = 0; i < list.length; i++){
            heap.add(list[i]);
        }
        
        for(int i = list.length - 1; i >=0; i--){
            list[i] = heap.remove();
        }
    }
    
    
}

