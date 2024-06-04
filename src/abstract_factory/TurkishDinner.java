package abstract_factory;

public class TurkishDinner implements Dinner {

    @Override
    public void prepare() {
        System.out.println("Turkish dinner is prepared");
    }
}
