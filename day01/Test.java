public class Test {   
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println();

        for(int i : array)
            System.out.print(i + " ");


        float floatValue = 32.149f;
        int intValue = (int)floatValue;

        System.out.println(intValue);

        byte byteValue = 6;
        short shortValue = 10;
        int result = byteValue + shortValue;
        short ressult2 = (short)(byteValue + shortValue);

        System.out.println("(int) result : " + result);
        System.out.println("(short) reuslt : " + ressult2);

        try {
            System.out.println(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage : Test filename");
            e.printStackTrace();
        }
    }
}