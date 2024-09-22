import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};
    
    static String monthName = "";

    public static void main(String[] args) {
        //
        // To do: add code here
        //
        System.out.print("Enter a digit 1 between 365 : ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int dayNum = Integer.parseInt(line);

        int monthNum = 0;
        boolean checked = false;

        /* calculate Month Number and days in Month using if statement */

        /*
        if (dayNum > 31) {     // January
            monthNum++;
            dayNum -= 31;
            checked = true;
        }

        if (dayNum > 28 && checked) {     // Feburary
            monthNum++;
            dayNum -= 28;
        }

        if (dayNum > 31 && checked) {     // March
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum > 30 && checked) {     // April
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum > 31 && checked) {     // May
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum > 30 && checked) {     // June
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum > 31 && checked) {     // July
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum > 31 && checked) {     // August
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum > 30 && checked) {     // September
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum > 31 && checked) {     // October
            monthNum++;
            dayNum -= 31;
        }

        if (dayNum > 30 && checked) {     // November
            monthNum++;
            dayNum -= 30;
        }

        if (dayNum > 31 && checked) {     // December
            monthNum++;
            dayNum -= 31;
        }
        */

        /*
        do {
            if (dayNum > 31) {     // Januaryd
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 28) {     // Feburary
                monthNum++;
                dayNum -= 28;
            }
            else {
                break;
            }
    
            if (dayNum > 31) {     // March
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 30) {     // April
                monthNum++;
                dayNum -= 30;
            }
            else {
                break;
            }
    
            if (dayNum > 31) {     // May
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 30) {     // June
                
                monthNum++;
                dayNum -= 30;
            }
            else {
                break;
            }
    
            if (dayNum > 31) {     // July
                
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 31) {     // August
                
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 30) {     // September
                
                monthNum++;
                dayNum -= 30;
            }
            else {
                break;
            }
    
            if (dayNum > 31) {     // October
                
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }
    
            if (dayNum > 30) {     // November
                
                monthNum++;
                dayNum -= 30;
            }
            else {
                break;
            }
    
            if (dayNum > 32) {     // December
                
                monthNum++;
                dayNum -= 31;
            }
            else {
                break;
            }

        } while (false);
          */

        for (int days : daysInMonth) {
            if (dayNum <= days) {
                break;
            }
            else {
                monthNum++;
                dayNum -= days;
            }
        }

       /*  Assign month name using switch statement */

        System.out.printf("%s - %d",monthNames[monthNum], dayNum);

        scanner.close();
    }
}