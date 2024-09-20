import java.util.ArrayList;

public class Assignment {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = primeFactorization(12);
        // for (int i : arr)
        //     System.out.print(i + " ");

        recursivePrimeFactorization(54, 2);
    }

    public static ArrayList<Integer> primeFactorization(int num) {

        ArrayList<Integer> primeFactor = new ArrayList<>();

        if (num <= 0) {
            return primeFactor;
        }

        int divide = 2;
        int prime = num;

        while (true) {
            
            if (prime < divide) {
                break;
            }

            if (prime % divide == 0) {
                primeFactor.add(divide);
                prime = (prime / divide);
            }
            else {
                divide++;
            }
        }

        return primeFactor;
    }

    public static void recursivePrimeFactorization(int num, int div) {
        
        if (num <= 0)
            return;

        int prime = num;

        if (prime < div)
            return;

        if (prime % div == 0) {
            System.out.println(div);
            prime = (prime / div);
            recursivePrimeFactorization(prime, div);
        }
        else {
            recursivePrimeFactorization(prime, div + 1);
        }
    }
}
