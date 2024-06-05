package prototype;

public class PrototypeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 10;

        Circle copiedCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;

        Rectangle copiedRectangle = (Rectangle) rectangle.clone();

        System.out.println((circle == copiedCircle) + " = false");
        System.out.println((rectangle == copiedRectangle) + " = false");

    }
}
