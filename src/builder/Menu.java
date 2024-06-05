package builder;

public class Menu {

    private Burger burger;
    private Fries fries;
    private Drink drink;
    private boolean isTakeAway;
    private PaymentType paymentType;

    private Menu(Builder menuBuilder) {
        this.burger = menuBuilder.burger;
        this.fries = menuBuilder.fries;
        this.drink = menuBuilder.drink;
        this.isTakeAway = menuBuilder.isTakeAway;
        this.paymentType = menuBuilder.paymentType;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "burger=" + burger +
                ", fries=" + fries +
                ", drink=" + drink +
                ", isTakeAway=" + isTakeAway +
                ", paymentType=" + paymentType +
                '}';
    }

    static class Builder {
        private Burger burger;
        private Fries fries;
        private Drink drink;
        private boolean isTakeAway;
        private PaymentType paymentType;

        public Builder burger(Burger burger) {
            this.burger = burger;
            return this;
        }

        public Builder fries(Fries fries) {
            this.fries = fries;
            return this;
        }

        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder takeAway(boolean isTakeAway) {
            this.isTakeAway = isTakeAway;
            return this;
        }

        public Builder paymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }
    }
}
