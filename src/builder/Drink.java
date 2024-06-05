package builder;

public class Drink {
    Size size;
    DrinkType drinkType;

    private Drink(Builder builder) {
        this.size = builder.size;
        this.drinkType = builder.drinkType;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size=" + size +
                ", drinkType=" + drinkType +
                '}';
    }

    static class Builder {
        Size size;
        DrinkType drinkType;

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder drinkType(DrinkType drinkType) {
            this.drinkType = drinkType;
            return this;
        }

        public Drink build() {
            return new Drink(this);
        }
    }
}
