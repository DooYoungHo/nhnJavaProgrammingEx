import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

public class Department<T extends Student> implements Iterable<T> {
    
    private String departName;
    List<T> studentList = new ArrayList<>();

    public Department(String name) {
        this.departName = name;
    }

    public List<T> getStudentList() {
        return this.studentList;
    }

    public String getDepartName() {
        return this.departName;
    }

    public void add(T stu) {
        studentList.add(stu);
    }

    public void sort(Comparator<T> t) {
        Collections.sort(this.studentList, t);        
    }

    public T remove() {
        if (studentList.isEmpty()) {
            throw new EmptyStackException();
        }
        return studentList.remove(studentList.size() - 1);
    }

    @Override
    public Iterator<T> iterator() {
        return studentList.iterator();
    }

}
