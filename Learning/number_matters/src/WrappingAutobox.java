public class WrappingAutobox {
    public static void main(String[] args) {
        int i = 288;
        Integer iWrap = i;
        System.out.println(iWrap);

        int unWrapped = iWrap;
        System.out.println(unWrapped);
    }
}

class TestBox {
    private Integer i;
    private int j;

    TestBox(Integer i) {
        this.i = i;
    }

    public static void main(String[] args) {
        TestBox t = new TestBox(2);
        t.go();

        int x = Integer.parseInt("2");
        double d = Double.parseDouble("420.24");
        boolean b = Boolean.parseBoolean("True");

        System.out.println("Parsing..............");
        System.out.println(x);
        System.out.println(d);
        System.out.println(b);
    }

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
