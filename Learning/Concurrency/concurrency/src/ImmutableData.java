/**
 * Make the class final so subclass can't add mutable values and also all fields final
 */
public final class ImmutableData {
    final String name;
    final int value;

    // all fields need to be initialised once, usually in the constructor
    public ImmutableData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Immutable class may have getters but no setters
    public String getName() { return name; }

    public int getValue() { return value; }
}

class Main {
    public static void main(String[] args) {
        ImmutableData id = new ImmutableData("age", 5);
        System.out.println(id.getName());
        System.out.println(id.getValue());
    }
}
