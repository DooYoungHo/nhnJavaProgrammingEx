public class DepartEmmerable implements Emmerator {

    Depart depart;
    private int index;

    public DepartEmmerable(Depart depart) {
        this.depart = depart;
        index = 0;
    }

    public Student next() {
        CollegeBoy collegeBoy = depart.getCollegeBoy(index);
        index++;
        return collegeBoy;
    };

    public boolean hasNext() {
        return index < depart.getLength();
    };
}
