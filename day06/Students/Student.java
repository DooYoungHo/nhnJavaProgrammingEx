public class Student {
    private int studentNo;
    private String studentName;

    public Student(int num, String name) {
        this.studentNo = num;
        this.studentName = name;
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    public String getSudentName() {
        return this.studentName;
    }

    @Override
    public String toString() {
        return this.studentNo + ", " + this.studentName;
    }
}