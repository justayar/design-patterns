package abstract_factory;

public class TurkishBreakfast implements Breakfast {
    @Override
    public void prepare() {
        System.out.println("Turkish breakfast is prepared");
    }
}
