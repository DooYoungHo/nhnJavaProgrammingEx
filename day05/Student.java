public class Student {
    int studentNo;
    int name;

    @Override
    public String toString() {
        return "1, " + "Celine";
    }

    @Override
    public boolean equals(Object stu) {
        return true;
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();

        System.out.println(s);
    }
}
