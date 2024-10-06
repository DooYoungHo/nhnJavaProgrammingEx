package com.nhnacademy;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int x = random.nextInt(100);
            System.out.print(Arrays.toString(a) + " + " + x);
            insert(a, i, x);
            System.out.println(" = " + Arrays.toString(a));
        }
        
    }

    public static void insert(int[] a, int length, int value) {
        
        int i = 0;
        
        for (i = 0; i < length; i++) {
            if (value <= a[i]) {
                break;
            }
        }

        // for (int j = (length - 1); j >= i; j--) {
        //     a[j + 1] = a[j];
        // }

        // a[i] = value;
        System.arraycopy(a, i, a, (i + 1), length - i);
    }

    public static int search(int[] a, int target) {
        for(int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // 2진 알고리즘 구현
    public static int binarySearch(int[] a, int target) {
        int start = 0;
        int end = a.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (a[mid] == target) {
                return mid;
            }
            else if (a[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
    /*        
        // float 타입을 갖는 배열 x 선언
        float[] x = new float[10];

        // main 함수의 입력 파라메터 args에 크기 10 배열 할당
        args = new String[10];

        // boolean 타입 배열 isPrime을 선언하고, 크기 5 배열 할당
        boolean[] isPrime = new boolean[5];

        // int 타입 배열 fib1을 선언하고, 0부터 시작하는 피보나치 수열 10개를 초기값으로 설정
        int[] fib1 = {0, 1, 1, 2, 3, 5, 8, 13};

        // int 타입 배열 fib2을 선언하고, new int[]와 함께 0부터 시작하는 피보나치 수열 10개를 초기값으로 설정
        int[] fib2 = new int[]{0, 1, 1, 2, 3, 5, 8, 13};

        // double 타입의 2차원 배열 a를 선언하고, 다음 값으로 초기화
        double[][] a = { { 1.1, 2.2 }, { 3.3, 4.4 }, null, { 5.5, 6.6 }, null };

        // short 타입의 2차원 배열 b를 선언하고, 4x10 배열로 할당
        short[][] b = new short[4][10];

        // Object 타입 배열 objects를 선언하고, 앞에서 생성한 x, args, isPrime, fib, b, a로 초기화
        Object[] objects = {x, args, isPrime, fib1, b, a};

        // Integer 타입 배열 ints를 선언하고, 요소가 없는 배열로 초기화
        Integer[] ints = new Integer[10];

        System.out.println("x = " + Arrays.toString(x));
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("isPrime = " + Arrays.toString(isPrime));
        System.out.println("fib1 = " + Arrays.toString(fib1));
        System.out.println("fib2 = " + Arrays.toString(fib2));
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("objects = " + Arrays.toString(objects));

        // 배열 objects가 Object[] 타입인지 확인
        System.out.println(objects instanceof Object[]);
        // 배열 objects의 0번째 요소가 Object 타입인지 확인
        System.out.println(objects[0] instanceof Object);
        // 배열 objects의 0번째 요소가 float[] 타입인지 확인
        System.out.println(objects[0] instanceof float[]);
        // 배열 b의 0번째 요소가  short[] 타입인지 확인
        System.out.println(b[0] instanceof short[]);
        // 배열 ints가 Object 타입인지 확인
        System.out.println(ints instanceof Object);
        // 배열 ints가 Object[] 타입인지 확인
        System.out.println(ints instanceof Object[]);



        System.out.println();
        System.out.println("Exam 2");
        // 1에서 9까지의 정수를 가짐
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // boolean 타입의 배열
        // 배열 a의 각 요소가 홀수 있지 결과 저장
        boolean[] b1 = new boolean[a1.length];
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] % 2 == 0) {
                b1[i] = false;
            }
            else {
                b1[i] = true;
            }
        }

        // 배열 a의 각 요소를 반지름으로 갖는 원들의 면적(Math.PI 이용)
        double[] c1 = new double[a1.length];
        for(int i = 0; i < a1.length; i++) {
            c1[i] = Math.PI * (a1[i] * a1[i]);
        }

        // 구구단을 저장하는 2차원 배열
        int[][] d1 = new int[9][9];
        for (int i = 1; i <= d1[0].length; i++) {
            for (int j = 1; j <= d1[0].length; j++) {
                d1[i - 1][j - 1] = i * j;
            }
        }

        System.out.println("a1[] = " + Arrays.toString(a1));
        System.out.println("b1[] = " + Arrays.toString(b1));
        System.out.println("c1[] = " + Arrays.toString(c1));
        for (int i = 0; i < d1[0].length; i++) {
            System.out.println("d1[] = " + Arrays.toString(d1[i]));
        } */