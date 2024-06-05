package prototype;

public abstract class Shape {
    public int x;
    public int y;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
        }
    }

    public abstract Shape clone();
}
