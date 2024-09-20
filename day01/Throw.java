import java.time.DateTimeException;

public class Throw {
    public static void main(String[] args) {
        try {
            int dayNumber = Integer.parseInt(args[0]);
            if (dayNumber < 1 || dayNumber >= 32) {
                throw new IllegalArgumentException("Invalid day number");
            }
        }
        catch(DateTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
