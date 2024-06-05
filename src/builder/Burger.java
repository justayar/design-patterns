package builder;

import java.util.Arrays;

public class Burger {
    Size size;
    String[] ingredients;
    BurgerType burgerType;

    public Burger(Builder builder) {
        this.size = builder.size;
        this.ingredients = builder.ingredients;
        this.burgerType = builder.burgerType;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", burgerType=" + burgerType +
                '}';
    }

    static class Builder {
        Size size;
        String[] ingredients;
        BurgerType burgerType;

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder ingredients(String[] ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Builder burgerType(BurgerType burgerType) {
            this.burgerType = burgerType;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
