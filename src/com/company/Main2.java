package com.company;

public class Main2 {
    public static void main(String[] args) {
        float[] array = new float[15];
        float sum = 0;
        boolean check = false;
        int kol = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (-5 + Math.random() * 10+5);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (float i : array) {
            if (i < 0)
                check = true;

            if (check) {
                if (i > 0) {
                    sum += i;
                    kol++;
                }
            }
        }

        if (kol == 0)
            System.out.println("Нет положительных элементов");
         else
            System.out.println("Сумма: " + sum + " Количество: " + kol + " Среднее арифметическое: " + sum / kol);

            System.out.println("Все понятно");


        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    float var = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = var;
                }
                System.out.print(array[j] + " ");
            }
            System.out.println();

        }
        for (float i : array) {
            System.out.print(i + " ");
        }
    }
}
