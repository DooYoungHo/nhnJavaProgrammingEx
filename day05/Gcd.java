public class Gcd {
    public static int gcd(int i, int j) {
        
        if (i % j == 0) {
            return j;
        }
        return gcd(j, i % j);
    }
}