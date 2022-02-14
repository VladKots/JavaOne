package ru.vladkots.se.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        // task 1
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //task 2
        fillArr();
        System.out.println();
        //task 3
        changeArr();
        //task 4
        fillDiag();
    }

    public static void fillArr() {
        int[] arr = new int[8];
        arr[0] = 0;
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArr() {
        int[] charr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] < 6) charr[i] = charr[i] * 2;
            System.out.print(charr[i] + " ");
        }
    }
    public static void fillDiag() {
        int[][] arr = new int[3][3];
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j != 1) arr[i][j] = 1;
                if (i == 1 && j == 1) arr[i][j] = 1;
                if (i == 2 && j != 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


