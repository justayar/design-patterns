package abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractMenuFactory abstractMenuFactory1 = MenuFactory.of(MenuType.TURKISH);
        abstractMenuFactory1.prepareBreakfast().prepare();
        abstractMenuFactory1.prepareDinner().prepare();
        System.out.println("-----------------------");
        AbstractMenuFactory abstractMenuFactory2 = MenuFactory.of(MenuType.ENGLISH);
        abstractMenuFactory2.prepareBreakfast().prepare();
        abstractMenuFactory2.prepareDinner().prepare();
    }
}
