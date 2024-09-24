public class Date {
    
    private int year;
    private int month;
    private int date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "year : " + this.year + ", month : " + this.month + ", date : " + this.date;
    }
}

class Date2 extends Date {
    public Date2() {
        super(1971, 4, 28);
    }
}

class Test {
    public static void main(String[] args) {
        Date date2 = new Date(2000, 1, 1);
        System.out.println(date2);
    }
}