public class Foo {
    static int x;

    public void go(){
        System.out.println("Foo: " + x);
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.go();

        Foo4 f4 = new Foo4();
        f4.go();

        Foo5 f5 = new Foo5();
        f5.go(20);

        Foo6.go(25);
    }
}

class Foo4 {
    static final int x = 12;

    public void go(){
        System.out.println("Foo4: " + x);
    }
}

class Foo5 {
    static final int x = 12;

    public void go(final int x){
        System.out.println("Foo5: " + x);
    }
}

class Foo6 {
    int x = 12;

    public static void go(final int x){
        System.out.println("Foo6: " + x);
    }
}