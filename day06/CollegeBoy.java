public class CollegeBoy extends Student {
    public int compareTo(Student s) {
        return this.studentNo > s.studentNo ? 1 : -1;
    }
}
