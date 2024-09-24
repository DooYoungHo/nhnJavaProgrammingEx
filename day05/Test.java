import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 비교 연산자는 스택안의 값을 비교함
        int[] arr = {1, 2, 3};
        int[] arr2 = arr;

        // 주소값이 같으므로 true
        System.out.println(arr == arr2);
        System.out.println(arr.equals(arr2));
        System.out.println(Arrays.equals(arr, arr2));

        System.out.println(Gcd.gcd(50, 10));

        Object o = 1;
        System.out.println(o.getClass().getName()); // Auto Boxing이 진행된다

        Object o2 = "Hi";
        System.out.println(o2.getClass().getName());

        D d = new D();
        C c = d;
        B b = d;

        b.m();
        System.out.println(b.getClass().getName());
    }
}



class A {
    public void m() {
        System.out.println("A");
    }
}

class B extends A {
    public void m() {
        System.out.println("B");
    }
}

class C extends B {
    public void m() {
        System.out.println("C");
    }
}

class D extends C {
    public void m() {
        System.out.println("D");
    }
}