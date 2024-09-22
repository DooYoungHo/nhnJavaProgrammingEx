package Arrays.exam.src.test.java.com.nhnacademy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MyArraysTest {

    MyArrays arrayTest = new MyArrays();

    @Test
    void testConcatenate() {
        // success Test
        Object[] ob1 = {"A", "B", "C"};
        Object[] ob2 = {1, 2, 3};
        Object[] test = arrayTest.concatenate(ob1, ob2);
        Object[] result = {"A","B","C",1,2,3};
        Assertions.assertArrayEquals(test, result);

        Object[] ob3 = null;
        Object[] ob4 = {1, 2, 3, 4, 5};
        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.concatenate(ob3, ob4);
        });
    }

    @Test
    void testMean() {
        int[] a = {1, 2, 3, 4, 5};
        double test = arrayTest.mean(a);
        double reuslt = 3.0;
        Assertions.assertEquals(reuslt, test);

        int[] b = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.mean(b);
        });
    }

    @Test
    void testMinimum() {
        int[] a = {1, 2, 3, 4, 5};
        int min = arrayTest.minimum(a);
        int result = 1;
        Assertions.assertEquals(result, min);

        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.mean(null);
        });
    }

    @Test
    void testReverse() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.reverse(null);
        });

        int[] a = {1, 2, 3, 4, 5};
        arrayTest.reverse(a);
        int[] result = {5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(result, a);
    }

    @Test
    void testShuffle() {
        Object[] a = {1, 2, 3, 4, 5};
        arrayTest.shuffle(a);
        Object[] test = {1, 2, 3, 4, 5};
        
    }

    @Test
    void testTally() {
        String tally = "aaBbcC";
        int[] result = new int[26];
        result[0] = 2;
        result[1] = 2;
        result[2] = 2;

        int[] test = arrayTest.tally(tally);
        Assertions.assertArrayEquals(result, test);
        
        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.tally(null);
        });
    }

    @Test
    void testWithoutDuplicates() {
        int[] a = {1, 1, 1, 2, 3, 4, 5};
        int[] result = {1, 2, 3, 4, 5};
        int[] test = arrayTest.withoutDuplicates(a);
        Assertions.assertArrayEquals(result, test);

        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.withoutDuplicates(null);
        });
    }

    @Test
    void testsieveOfEratosthenes() {
        int[] result = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,  53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] test = arrayTest.sieveOfEratosthenes(100);
        Assertions.assertArrayEquals(result, test);

        int[] result2 = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
            103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199,
            211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
            331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449,
            457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593,
            599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727,
            733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863,
            877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};
        int[] test2 = arrayTest.sieveOfEratosthenes(1000);
        Assertions.assertArrayEquals(result2, test2);

        Assertions.assertThrows(NullPointerException.class, () -> {
            arrayTest.sieveOfEratosthenes(0);
        });
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> providePascalTriangleData() {
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(1, new int[][]{{1}}),
            org.junit.jupiter.params.provider.Arguments.of(2, new int[][]{{1}, {1, 1}}),
            org.junit.jupiter.params.provider.Arguments.of(3, new int[][]{{1}, {1, 1}, {1, 2, 1}}),
            org.junit.jupiter.params.provider.Arguments.of(4, new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}})
        );
    }

    @ParameterizedTest
    @MethodSource("providePascalTriangleData")
    void testPascalTriangle(int arg, int[][] val) {
        int[][] a = arrayTest.pascalTriangle(arg);
        Assertions.assertArrayEquals(val, a);
    }
}
