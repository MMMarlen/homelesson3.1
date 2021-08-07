package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] a = {
                1.5,
                7.9,
                -5.4,
                2.1,
                9.4,
                -5.1,
                8.3,
                0.3,
                7.3,
                1.9,
                8.4,
                5.3,
                -8.3,
                3.6,
                7.0
        };
        boolean negative = false;
        double result = 0;
        int sum = 0;

        for (double b : a) {
            if (b > 0 && negative) {
                result += b;
                sum++;
            } else {
                negative = true;
            }
        }
        System.out.println(result / sum);
        med(a);

    }

    public static void med(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
/*ДЗУрок3

Затем через цикл “for each” посчитать среднее арифметическое положительных чисел
расположенных после первого отрицательного числа и вывести его на экран (8, -2, -4, 2, 3, 6) = 11/3

ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию:
каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
При этом каждую новую итерацию начинать сдвигаясь вправо,
то есть первый проход — с первого элемента, второй проход — со второго и т.д.

И при каждой итерации распечатывать текущее состояние массива
{-4, -2, 2, 3, 6, 8}*/