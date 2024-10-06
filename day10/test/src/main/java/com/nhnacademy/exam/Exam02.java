package com.nhnacademy.exam;

import java.util.Random;

public class Exam02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] k = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            System.out.print(toString(a, k, i) + " + " + x);
            insert(a, k, i, x);
            System.out.println(" = " + toString(a, k, i + 1));
        }
    }

    public static void insert(int[] array1, int[] array2, int length, int value) {
        if (length < 0 || array1.length <= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        // array1이 기본 배열, array2가 index 배열
        array1[length] = value;

        int i = 0;

        for (i = 0; i < length; i++) {
            if (value <= array1[array2[i]]) {
                break;
            }
        }
        System.arraycopy(array2, i, array2, i+1, length - i);
        array2[i] = length;
    }

    public static String toString(int[] a, int[] k, int length) {
        StringBuilder builder = new StringBuilder();
    
        builder.append("[");
        if (length > 0) {
            builder.append(String.format("%3d", a[k[0]]));
        }
    
        for (int i = 1; i < length; i++) {
            builder.append(String.format(", %3d", a[k[i]]));
        }
        builder.append("]");
    
        return builder.toString();
    }
    
}
