public class ShapeMain {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.playSound();
        sq.rotate();
        sq.squarePersonal();

        System.out.println("===================================");
        Amoeba amoeba = new Amoeba();
        amoeba.playSound();
        amoeba.rotate();
        System.out.println("================================");
        Shape shape = new Square();
        shape.rotate();
    }
}
