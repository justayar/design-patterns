package builder;

public class Fries {
    Size size;
    Sauce sauce;

    private Fries(Builder builder) {
        this.size = builder.size;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Fries{" +
                "size=" + size +
                ", sauce=" + sauce +
                '}';
    }

    static class Builder {
        Size size;
        Sauce sauce;

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Fries build() {
            return new Fries(this);
        }
    }
}