package lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSelectionSort {

    @Test
    void testPositiveIntegers() {
        SelectionSort sorter = new SelectionSort();
        int[] testPositives = {4, 2, 7, 1, 9};
        int[] expected = {1, 2, 4, 7, 9};

        System.out.println("Running testPositiveIntegers:");
        System.out.println("Original Array: " + arrayToString(testPositives));
        int[] result = sorter.basicSelectionSort(testPositives);
        System.out.println("Sorted Array: " + arrayToString(result));

        assertArrayEquals(expected, result);
    }

    @Test
    void testNegativeIntegers() {
        SelectionSort sorter = new SelectionSort();
        int[] testNegatives = {-3, -8, -1, -5, -2};
        int[] expected = {-8, -5, -3, -2, -1};

        System.out.println("Running testNegativeIntegers:");
        System.out.println("Original Array: " + arrayToString(testNegatives));
        int[] result = sorter.basicSelectionSort(testNegatives);
        System.out.println("Sorted Array: " + arrayToString(result));

        assertArrayEquals(expected, result);
    }



    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
