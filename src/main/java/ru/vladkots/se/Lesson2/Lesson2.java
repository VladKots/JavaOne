package ru.vladkots.se.Lesson2;

import java.util.Arrays;

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
        //task 5
        findMinMax();
        //task 6
        int[] arr61 = {1, 1, 1, 2, 1};
        System.out.println(checkBalance(arr61));
        int[] arr62 = {2, 2, 2, 2, 2};
        System.out.println(checkBalance(arr62));
        int[] arr63 = {2, 1, 1, 2, 1};
        System.out.println(checkBalance(arr63));
        int[] arr64 = {20, 20};
        System.out.println(checkBalance(arr64));

        int[] arr71 = {1, 2, 3, 4, 5};
        movePosition(arr71, 2);
        System.out.println(Arrays.toString(arr71));
        int[] arr72 = {1, 2, 3, 4, 5};
        movePosition(arr72, -2);
        System.out.println(Arrays.toString(arr72));
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

    public static void findMinMax() {
        int[] arr = {5, 4, 17, 2, 58, 31, 26, 7, 33};
        {
            int a, b;
            a = arr[0];
            b = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (a > arr[i]) a = arr[i];
                if (b < arr[i]) b = arr[i];
            }
            System.out.println("Наименьший элемент массива: " + a);
            System.out.println("Наибольший элемент массива: " + b);
        }
    }

    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        //ищем сумму элементов
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        if ((sum % 2) == 0) {
            //если сумма делится на 2 - продолжаем поиски
            int a = 0;
            sum = sum / 2;
            int i = 0;
            while (i < arr.length && a <= sum) {
                //высчитываем сумму левой части
                a = a + arr[i];
                if (a == sum) return true;
                i++;
            }
        }
        return false;
    }

    public static int[] movePosition(int[] arr, int n) {
        if (n > 0) {
            //двигаем вправо
            for (int i = 1; i <= n; i++) {
                int tmp = arr[(arr.length - 1)];
                for (int j = (arr.length - 1); j > 0; j--) {
                    arr[j] = arr[(j - 1)];
                }
                arr[0] = tmp;
            }
        } else {
            //двигаем влево
            n = Math.abs(n);
            for (int i = 1; i <= n; i++) {
                int tmp = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[(j - 1)] = arr[j];
                }
                arr[(arr.length - 1)] = tmp;
            }
        }
        return arr;
    }
}


