public class MathMethods {

    public static void main(String[] args) {
        int x = Math.abs(-240);
        double d = Math.abs(240.45);
        System.out.println(x);
        System.out.println(d);

        double r1 = Math.random();
        int r2 = (int) (Math.random() * 5);
        System.out.println(r1);
        System.out.println(r2);
    }
}
