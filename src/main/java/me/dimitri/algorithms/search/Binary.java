package me.dimitri.algorithms.search;

public class Binary {

    public static void main(String[] args) {
        int[] array = new int[1000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        long start;
        long end;
        long lapse;

        start = System.nanoTime();
        int binarySearch = binarySearch(array, 700000);
        end = System.nanoTime();
        lapse = end - start;
        System.out.println("Binary Search Result: " + binarySearch + " Time: " + lapse);

        start = System.nanoTime();
        int linearSearch = linearSearch(array, 700000);
        end = System.nanoTime();
        lapse = end - start;
        System.out.println("Linear Search Result: " + linearSearch + "  Time: " + lapse);
    }

    private static int binarySearch(int[] array, int index) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;
            int value = array[middle];

            if (value < index) {
                left = middle + 1;
            } else if (value > index) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] array, int index) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                return i;
            }
        }
        return -1;
    }

}
