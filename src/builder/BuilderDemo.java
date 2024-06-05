package builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Menu menu = new Menu.Builder()
                .burger(new Burger.Builder()
                        .burgerType(BurgerType.BIG_MAC)
                        .ingredients(new String[]{"lettuce", "cheese", "tomato"})
                        .size(Size.LARGE)
                        .build())
                .drink(new Drink.Builder()
                        .drinkType(DrinkType.COKE)
                        .size(Size.LARGE)
                        .build())
                .fries(new Fries.Builder()
                        .sauce(Sauce.MAYONNAISE)
                        .size(Size.SMALL)
                        .build())
                .build();

        System.out.println(menu.toString());
    }
}
