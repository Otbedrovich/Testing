package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        taskFive(191, -181);
        taskSix(4);
        taskSeven(3);
        taskEight("Abcx", 3);
        taskNine(2024);
        taskTen();
        taskEleven();

    }

    public static void printThreeWords() {
        System.out.println("\nOrange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 255;
        int b = -279;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 99;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 1500;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void taskFive(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void taskSix(int a) {

        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void taskSeven(int a) {

        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void taskEight(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a); // Для вывода всех сообщений в одну строку System.out.print(a);
        }
    }

    public static void taskNine(int year) {
        boolean leapYear = true;
        boolean nonLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(leapYear);
        } else {
            System.out.println(nonLeapYear);
        }
    }

    public static void taskTen() {
        int[] array = {1, 0, 0, 0, 1, 0, 1, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.println(0); // Не понял как грамотно вывести
        }
    }
    public static void taskEleven(){
        int i = 1;

        for (int j = 1; j <= 100; j++) {
            System.out.print(i + (i++ % 10 == 0 ? "\n" : " "));
        }
    }
}

