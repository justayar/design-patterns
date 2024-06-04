package factory;

public class ShapeFactory {
    public static Shape of(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE -> {
                return new Rectangle();
            }
            case SQUARE -> {
                return new Square();
            }
            default -> throw new RuntimeException("Unsupported shape type");
        }
    }
}
