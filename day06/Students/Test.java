public class Test {
    public static void main(String[] args) {
        Depart departMent = new Depart(5);
        
        CollegeBoy s1 = new CollegeBoy(1, "A");
        CollegeBoy s2 = new CollegeBoy(2, "B");
        CollegeBoy s3 = new CollegeBoy(3, "C");
        CollegeBoy s4 = new CollegeBoy(4, "D");

        departMent.add(s1);
        departMent.add(s2);
        departMent.add(s3);
        departMent.add(s4);

        System.out.println("현재 학생 수 : " + departMent.getLength());

        Emmerator et = departMent.getEmmerator();
        while (et.hasNext()) {
            Student c = et.next();
            System.out.println(c.getSudentName());
        }
    }
}
