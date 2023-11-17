public class PhraseOMatic {
    public static void main(String[] args) {
        java.util.Random randomGenerator = new java.util.Random();
        String[] pets = {"Fido", "Zeus", "Bin"};
        int x = randomGenerator.nextInt(pets.length);
        System.out.println(x);
        String s = pets[x];
        System.out.println(s + " " + "is a dog");

    }
}
