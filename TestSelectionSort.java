package lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSelectionSort {


    @Test
    void testMixedIntegers() {
        SelectionSort sorter = new SelectionSort();
        int[] testMixed = {5, -4, 0, 2, -7};
        int[] expected = {-7, -4, 0, 2, 5};

        System.out.println("Running testMixedIntegers:");
        System.out.println("Original Array: " + arrayToString(testMixed));
        int[] result = sorter.basicSelectionSort(testMixed);
        System.out.println("Sorted Array: " + arrayToString(result));

        assertArrayEquals(expected, result);
    }

    @Test
    void testDuplicates() {
        SelectionSort sorter = new SelectionSort();
        int[] testDuplicates = {3, 1, 4, 2, 1, 4};
        int[] expected = {1, 1, 2, 3, 4, 4};

        System.out.println("Running testDuplicates:");
        System.out.println("Original Array: " + arrayToString(testDuplicates));
        int[] result = sorter.basicSelectionSort(testDuplicates);
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
