package abstract_factory;

public class TurkishMenuFactory implements AbstractMenuFactory {
    @Override
    public Breakfast prepareBreakfast() {
        return new TurkishBreakfast();
    }

    @Override
    public Dinner prepareDinner() {
        return new TurkishDinner();
    }
}
