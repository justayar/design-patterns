package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.of(ShapeType.RECTANGLE);
        shape1.draw();

        Shape shape2 = ShapeFactory.of(ShapeType.SQUARE);
        shape2.draw();
    }
}
