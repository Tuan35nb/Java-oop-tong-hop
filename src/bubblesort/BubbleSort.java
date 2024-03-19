/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Random;
import java.util.Scanner;

/**
 * This class BubbleSort
 *
 * @author ASUS
 */
public class BubbleSort {

    /**
     * The main method where the program execution begins
     *
     * @param args argument for terminal input
     * @return void
     */
    public static void main(String[] args) {
        // Get the size of the array from the user
        int size = intputSizeOfArray();
        // Generate an array with random values
        int[] array = inputValueOfArray(size);
        // Sort the array using bubble sort
        sortArrayByBubbleSort(array);
        // Print the sorted array
        print(array);
    }

    /**
     * check user input a number integer
     *
     * @return result
     */
    private static int checkInputInt() {
        Scanner scanner = new Scanner(System.in);
        // Start an infinite loop to continuously request input from the user
        while (true) {
            try {
                // Read a line of input from the keyboard, then parse it into an integer
                int result = Integer.parseInt(scanner.nextLine().trim());
                // Check if the entered number is negative
                if (result < 0) {
                    // Display an error message requesting a non-negative number
                    System.err.println("Please enter a non-negative number: ");
                } else {
                    // If the number is non-negative, return that value
                    return result;
                }
                // Handle an exception if the user enters a non-numeric value
            } catch (NumberFormatException e) {
                // Display an error message requesting a number
                System.err.println("Please input number ");
                // Display a message asking to enter again
                System.out.println("Enter again: ");
            }
        }
    }

    /**
     * Method to input the size of the array from the user
     *
     * @return size
     */
    private static int intputSizeOfArray() {
        //notice user enter input
        System.out.println("Enter number of array: ");
        int size = checkInputInt();
        return size;
    }

    /**
     * Method to generate an array of random integers with the specified size
     *
     * @param number
     * @return array
     */
    private static int[] inputValueOfArray(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(number);
        }
        return array;
    }

    /**
     * Method to perform the bubble sort algorithm on the array
     *
     * @param array
     */
    private static void sortArrayByBubbleSort(int[] array) {
        //display unsorted array
        System.out.println("Unsorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    /**
     * Method to print the sorted array
     *
     * @param array
     */
    private static void print(int[] array) {
        //display sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
