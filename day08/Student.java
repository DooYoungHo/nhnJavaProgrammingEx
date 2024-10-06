public class Student implements Comparable<Student> {
    
    private String name;
    private int studentNo;

    public Student(String name, int studentNo) {
        this.name = name;
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return this.name;
    }

    public int getStudentNo() {
        return this.studentNo;
    }

    @Override
    public String toString() {
        return this.name + " , " + this.studentNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentNo() - o.getStudentNo();
    }
}