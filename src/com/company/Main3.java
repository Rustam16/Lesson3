package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {


        System.out.println("Привет друг  \nесли ты хочешь вычислить среднее арифметическое " +
                "положительных чисел расположенных после первого отрицательного числа то введи '1'\n" +
                "если ты хочешь отсортировать числовую последовательность то введи '2'");
        Scanner operationSelection = new Scanner(System.in);
        byte operation = operationSelection.nextByte();
        if (operation == 1) {
            average();
        }
        if (operation == 2) {
            sorting();
        }
    }

    public static void average() {
        Scanner readingArrayElements = new Scanner(System.in);
        double mediateInterResult = 0.0;
        double result;
        boolean b = false;
        int numbers = 0;
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " число");
            array[i] = readingArrayElements.nextDouble();
        }
        for (double arrayTemp : array) {
            if (b) {
                mediateInterResult += arrayTemp;
                numbers++;
            }
            if (arrayTemp < 0) {
                b = true;
            }

        }
        result = mediateInterResult / numbers;
        System.out.println(result);
    }

    public static void sorting() {
        Scanner readingArrayElements = new Scanner(System.in);
        double[] array = new double[15];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " число");
            array[i] = readingArrayElements.nextDouble();
        }
        boolean isSorted = false;
        double buff;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
