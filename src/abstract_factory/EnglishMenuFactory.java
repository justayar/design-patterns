package abstract_factory;

public class EnglishMenuFactory implements AbstractMenuFactory {

    @Override
    public Breakfast prepareBreakfast() {
        return new EnglishBreakfast();
    }

    @Override
    public Dinner prepareDinner() {
        return new EnglishDinner();
    }
}
