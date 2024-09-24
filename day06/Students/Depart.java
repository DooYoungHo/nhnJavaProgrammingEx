public class Depart implements Emmerable {
    
    private int departNo;
    private String departName;
    private int index = 0;

    CollegeBoy[] collegeBoys;

    public Depart(int size) {
        collegeBoys = new CollegeBoy[size];
    }

    public void add(CollegeBoy boy) {
        collegeBoys[index++] = boy;
    }

    public int getDepartNo() {
        return departNo;
    }

    public String getDepartName() {
        return departName;
    }

    public int getLength() {
        return index;
    }

    public CollegeBoy getCollegeBoy(int index) {
        return collegeBoys[index];
    }

    public Emmerator getEmmerator() {
        return new DepartEmmerable(this);
    }
}
