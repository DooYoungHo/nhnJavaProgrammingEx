package Arrays.exam.src.main.java.com.nhnacademy;
import java.util.Random;

/**
 * Javadoc NHN - academy 과제
 *
 * @author youngho
 * @version 1.0
 */
public class MyArrays {
    
    /**
     * modifier가 public으로 int[] array의 element 중
     * 가장 작은 값을 구하는 메서드 입니다.
     * @param a int[] array
     * @throws NullPointerException 메서드 실행 시 발생할 수 있는 예외입니다.
     * @return int element요소 중 가장 작은 값을 반환합니다.
     */
    public int minimum(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    /**
     * modifier가 public으로 int[] array의 element 값들의
     * 평균값을 반환해주는 메소드입니다.
     * @param a int[] array
     * @throws NullPointerException 배열의 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return double형 변수 평균값을 반환합니다.
     */
    public double mean(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        double average = 0;
        for (int i = 0; i < a.length; i++) {
            average += a[i];
        }
        return average / a.length;
    }

    /**
     * modifier가 public으로 int[] array의 중복값을
     * 제거한 새로운 배열을 return해주는 메소드입니다.
     * @param a int[] array
     * @throws NullPointerException 배열의 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return result int[]배열로 중복값을 제거한 배열입니다.
     */
    public int[] withoutDuplicates(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
    
        int[] temp = new int[a.length];
        int count = 0;
    
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < count; j++) {
                if (a[i] == temp[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[count++] = a[i];
            }
        }
    
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
    
        return result;
    }

    /**
     * modifier가 public으로 int[] array의 element위치를
     * 역순으로 반환해주는 메소드입니다.
     * @param a int[] array
     * @throws NullPointerException 배열의 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return 
     */
    public void reverse(int[] a) {
        if (a == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < (a.length / 2); i++) {
            int temp = a[(a.length - 1)- i];
            a[(a.length - 1) - i] = a[i];
            a[i] = temp;
        }
    }

    /**
     * modifier가 public으로
     * Object[] a의 element요소들과,
     * Object[] b의 element요소들을 합친
     * 새로운 Object[] 배열을 반환해주는 메소드입니다. 
     * @param a,b Object[], Object[] 배열입니다.
     * @throws NullPointerException 배열의 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return result 두 Object[] 배열의 값을 합친 Object[] 배열입니다.
     */
    public Object[] concatenate(Object[] a, Object[] b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Object[] result = new Object[a.length + b.length];

        int i = 0;
        for (i = 0; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            result[i + j] = b[j];
        }
        return result;
    }

    /**
     * modifier가 public으로 Object[] array의 element들을
     * 무작위로 섞어주는 메소드입니다.
     * @param a Object[] 배열입니다.
     * @throws NullPointerException 배열의 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return
     */
    public void shuffle(Object[] a) {

        if (a == null) {
            throw new NullPointerException();
        }

        Random random = new Random();
        for(int i = 0; i < a.length; i++) {
            int rand = random.nextInt(a.length);
            Object temp = a[i];
            a[i] = a[rand];
            a[rand] = temp;
        }
    }

    /**
     * modifier가 public으로 string 문자열의
     * 문자 값을 담은 int[] 배열을 반환합니다.
     * @param string 문자열을 받습니다.
     * @throws IllegalArgumentException 문자열 값이 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return result int[]배열로 중복값을 제거한 배열입니다.
     */
    public int[] tally(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        String lowerString = string.toLowerCase();
        int[] tally = new int[26];

        for (int i = 0; i < lowerString.length(); i++) {
            tally[lowerString.charAt(i) - 'a']++;
        }

        return tally;
    }

    /**
     * modifier가 public으로 size 크기만큼의
     * 소수를 담은 배열을 반환합니다.
     * @param size 소수를 구할 크기입니다.
     * @throws IllegalArgumentException size값이 0이 들어오면 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return result int[]배열로 중복값을 제거한 배열입니다.
     */
    public int[] sieveOfEratosthenes(int size) {

        if (size == 0) {
            throw new IllegalArgumentException();
        }

        boolean[] prime = new boolean[size + 1];

        prime[0] = false;
        prime[1] = false;
        int count = 0;
        for (int i = 2; i <= Math.sqrt(size); i++) {
            
            if (prime[i] == true) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        for(int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                count++;
            }
        }

        int[] result = new int[count];
        count = 0;
        for(int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                result[count++] = i;
            }
        }

        return result;
    }

    /**
     * modifier가 public으로 파스칼 삼각형을 구현하는 메서드입니다.
     * @param size 값을 구할 size입니다.
     * @throws IllegalArgumentException size값이 0이 들어오면 null이 들어왔을 때 발생할 수 있는 에러입니다.
     * @return pascal int[][] 2차원 배열을 반환합니다.
     */
    public int[][] pascalTriangle(int size) {
        
        if (size == 0) {
            throw new IllegalArgumentException();
        }
        
        int[][] pascal = new int[size][];
        
        for (int i = 0; i < size; i++) {
            pascal[i] = new int[i + 1];

            pascal[i][0] = 1;
            pascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return pascal;
    }
}