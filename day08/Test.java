import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        HighSchoolBoy h1 = new HighSchoolBoy("J", 1);
        HighSchoolBoy h4 = new HighSchoolBoy("K", 2);
        HighSchoolBoy h3 = new HighSchoolBoy("Q", 3);
        HighSchoolBoy h2 = new HighSchoolBoy("Z", 4);

        Department<HighSchoolBoy> department = new Department<>("IT");
        department.add(h1);
        department.add(h2);
        department.add(h3);
        department.add(h4);

        Collections.sort(department.getStudentList());
        
        department.sort((x, y) -> x.getStudentName().compareTo(y.getStudentName()));

        for (Student stu : department.getStudentList()) {
            System.out.println(stu);
        }
    }
}