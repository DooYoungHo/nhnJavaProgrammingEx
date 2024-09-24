public class A {
    
}

class B extends A {

}

class C extends B {

}

class D extends C {

}

class Test {
    public static void main(String[] args) {
        D d = new D();
        C c = d;
        B b = c;
        A a = b;
    }
}
