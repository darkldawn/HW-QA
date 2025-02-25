import java.util.Arrays;

import static lesson_5.HWAQA.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            System.out.println(isSumInRange(3,10));
            printNumberSign(-8);
            printNumberSign(16);
            System.out.println(isNegative(0));
            System.out.println(isNegative(15));
            printStringMultipleTimes("Hamburger",2);
            System.out.println(isLeapYear(2024));
            System.out.println(isLeapYear(1945));
            int[] binaryArray = {1,1,0,0,1,0,1,1,0,0};
            invertArray(binaryArray);
            System.out.print(Arrays.toString(binaryArray));
            int[] hundredArray = new int [100];
            fillArrayOneToHundred(hundredArray);
            System.out.println("Массив, заполненный от 1 до 100");
            printArray(hundredArray);
            int[] array = {1, 5, 3, 2, 11, 4, 5, 4, 8, 9, 1};
            System.out.println("Исходный массив:");
            printArray(array);
            multiplyIfLessThanSix(array);
            System.out.println("Модицифированный массив:");
            printArray(array);
            int n = 5;
            int [][] squareArray = new int [n][n];
            fillDiagonal(squareArray);
            System.out.println("Квадратный массив с заполненной диагональю:");
            print2DArray(squareArray);
            int len = 10;
            int initialValue = 7;
            int[] initializedArray = initializeArray(len,initialValue);
            System.out.println("Массив с заданной длиной и значением");
            printArray(initializedArray);
        }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign() {
            int a = 5;
            int b = -3;

            int sum = a + b;
            System.out.println("Сумма положительная");
        }
        public static void printColor() {
            int value = 50;

            if  (value <= 0 ) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100 ) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers() {
            int a = 10;
            int b = 20;
            if(a >= b){
                System.out.println("a >= b");
            } else {
                System.out.println("a < b");
            }
        }
        public static boolean isSumInRange(int a, int b) {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
        public static void printNumberSign(int number) {
            if (number >= 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отрицательное число");
            }
        }
        public static boolean isNegative(int number) {
            return number < 0;
        }
        public static void printStringMultipleTimes(String str, int times) {
            for (int i = 0; i < times; i++) System.out.println(str);
        }
        public static boolean isLeapYear(int year) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
        public static void invertArray(int[] array) {
            for(int i=0; i < array. length; i++) {
                array[i] = (array[i] == 0) ? 1 : 0;
            }
        }
        public static void fillArrayOneToHundred(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
        }
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        public static void print2DArray(int[] [] array) {
            for (int[] row : array) {
                for (int elem : row) {
                    System.out.println();
                }
            }
        }
        public static void multiplyIfLessThanSix(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array [i] < 6) {
                    array[i] *=2;
                }
            }
        }
        public static void fillDiagonal (int [][] array) {
            for (int i = 0; i < array.length; i++) {
                array[i][i] = 1;
                array[i][array.length - i - 1] = 1;

            }
        }
        public static int[] initializeArray(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }
    }