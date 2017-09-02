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
class Heap<E extends Comparable> {

    private ArrayList<E> list = new ArrayList<E>();

    public Heap() {
    }

    public Heap(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }

    public void add(E newObject) {
        list.add(newObject);
        int currentIndex = list.size() - 1;
        
        System.out.println("\nAdded number: " + newObject);
        printHeap("After Iteration: ");
        while (currentIndex > 0) {
            //printHeap("Before Iteration: ");

            int parentIndex = (currentIndex - 1) / 2;
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
                printHeap("After Iteration: ");
            } else {
                printHeap("After Iteration: ");
                break;
            }
            currentIndex = parentIndex;
        }
        printHeap("Next Iteration: ");
    }

    public E remove() {
        if (list.size() == 0) {
            return null;
        }

        E removeObject = list.get(0);
        System.out.println("\nRemoved number: " + removeObject);
        printHeap("After Iteration: ");
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        
        printHeap("After Iteration: ");
        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            if (leftChildIndex >= list.size()) {
                break;
            }
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()) {
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
                printHeap("After Iteration: ");
            } else {
                printHeap("After Iteration: ");
                break;
            }
        }
        printHeap("Next Iteration: ");
        return removeObject;
    }

    public int getSize() {
        return list.size();
    }

    public void printHeap(String word) {
        int total = 0;
        int currentRow = 1;
        System.out.println(word);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if (i == total) {
                System.out.println();
                currentRow = currentRow * 2;
                total = total + currentRow;
            }
        }
        System.out.println();
        total = 0;
        currentRow = 1;
    }
}
