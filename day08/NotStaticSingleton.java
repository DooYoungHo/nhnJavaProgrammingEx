import java.util.ArrayList;
import java.util.List;

public class NotStaticSingleton {
    
    public NotStaticSingleton() {
        
    }

    public NotStaticSingleton getSingleton() {
        if (Save.singleton.size() == 0) {
            Save.singleton.add(new NotStaticSingleton());
        }
        return Save.singleton.get(0);
    }
}

class Save {
    static List<NotStaticSingleton> singleton = new ArrayList<>();
}

class Test {

    public static void main(String[] args) {
        NotStaticSingleton n1 = new NotStaticSingleton();
        NotStaticSingleton n2 = new NotStaticSingleton();
        NotStaticSingleton n3 = new NotStaticSingleton();
        NotStaticSingleton n4 = new NotStaticSingleton();


        System.out.println(n1.getSingleton());
        System.out.println(n2.getSingleton());
        System.out.println(n3.getSingleton());
        System.out.println(n4.getSingleton());
    }
}
