package ru.vladkots.se;

public class Lesson1 {
    // task 2
    byte b = 1;
    short s= 200;
    int i = 15;
    long a = 100000L;
    float f = 1.5f;
    double d = 2.55;
    boolean bool = true;
    char ch = 'a';

    // task 3
    public static int calc(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    // task 4
    public static boolean inRange(int a1, int b1){
        int c1 = a1 + b1;

        return c1 >= 10 && c1 <= 20;
    }
    // task 5
    public static void isPosOrNeg(int x5){
        if (x5>=0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    // task 6
    public static boolean isNeg(int x6){
        return x6 < 0;
    }
    // task 7
    public static void greeting(String name){
        System.out.println("Привет, " + name + "!");
    }
    // task 8
    public static String checkLeapYear(int year){
        if((year % 400) == 0 || ((year % 100) != 0 && (year % 4) == 0)){
            return "Високосный год!";
        }
        return "НЕвисокосный год!";
    }

    // task 1 & exam
    public static void main(String[] args) {
        System.out.println(calc(2,5,10,2));
        System.out.println(inRange(2,7));
        isPosOrNeg(-5);
        System.out.println(isNeg(2));
        greeting("Толик");
        System.out.println(checkLeapYear(2022));
    }
}

