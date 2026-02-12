package baitap2;

import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 6, 1, 3};

        insertionSort(a);

        System.out.println(Arrays.toString(a)); // [1, 2, 3, 4, 5, 6]
    }
}

