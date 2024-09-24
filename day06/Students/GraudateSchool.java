public class GraudateSchool implements Emmerable {
    
    private String schoolName;
    private int index;
    
    private Graduate[] graduates;

    public GraudateSchool(int size) {
        graduates = new Graduate[size];
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void add(Graduate graduate) {
        graduates[index++] = graduate;
    }

    public Graduate getGraduate(int index) {
        return graduates[index];
    }

    public int getLength() {
        return index;
    }

    public Emmerator getEmmerator() {
        return new GraduateEmmerable(this);
    }
}
