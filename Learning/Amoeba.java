public class Amoeba extends Shape {
    @Override
    public void rotate() {
        super.rotate();
        System.out.println("I am rotate in child class");
    }

    @Override
    public void playSound() {
        super.playSound();
        System.out.println("I am playSound in child class");
    }
}
