public class Singleton {

    private int var;
    private int cardNo;
    private int creaditNo;

    private static Singleton singleton;

    private Singleton() {}

    public int getCardNo() {
        return this.cardNo++;
    }

    public int getCreaditNo() {
        return this.creaditNo++;
    }

    public int getVar() {
        return this.var;
    }

    public void setVar(int v) {
        this.var = v;
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    @Override
    public String toString() {
        return this.var + " ";
    }
}

class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        s1.setVar(10);

        System.out.println(s1);
        System.out.println(s2);
    }
}
