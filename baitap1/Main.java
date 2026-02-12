package baitap1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.println("\nMang ban dau: " + Arrays.toString(a));
        insertionSortWithSteps(a);
        System.out.println("\nKet qua cuoi: " + Arrays.toString(a));
    }

    private static void insertionSortWithSteps(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            System.out.println("\n--- Buoc i = " + i + " (key = " + key + ") ---");

            // dịch các phần tử lớn hơn key sang phải
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
                System.out.println("Dich sang phai: " + Arrays.toString(a));
            }

            // chèn key vào vị trí đúng
            a[j + 1] = key;
            System.out.println("Chen key:      " + Arrays.toString(a));
        }
    }
}
