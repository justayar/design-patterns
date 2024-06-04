package abstract_factory;

public class MenuFactory {

    public static AbstractMenuFactory of(MenuType menuType) {
        switch (menuType) {
            case TURKISH -> {
                return new TurkishMenuFactory();
            }
            case ENGLISH -> {
                return new EnglishMenuFactory();
            }
            default -> throw new RuntimeException("Unsupported menu type");
        }
    }
}
