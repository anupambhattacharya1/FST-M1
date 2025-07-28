package Activites;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13}; // You can change or input your own values

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array (Ascending Order):");
        printArray(arr);
    }
    
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}