public class GraduateEmmerable implements Emmerator {
    
    private GraudateSchool graduate;
    private int index;

    public GraduateEmmerable(GraudateSchool graduate) {
        this.graduate = graduate;
    }

    public Student next() {
        Graduate graudateSchool = graduate.getGraduate(index);
        index++;
        return graudateSchool;
    };

    public boolean hasNext() {
        return index < graduate.getLength();
    };
}
