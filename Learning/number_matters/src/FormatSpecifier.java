public class FormatSpecifier {
    public static void main(String[] args) {
        System.out.printf("%d%n", 42);
        System.out.printf("%.3f%n", 42.00000);
        System.out.printf("%x%n", 42);

        int one = 20456654;
        double two = 100567890.248907;
        String s = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println(s);
    }
}
