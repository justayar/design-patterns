package abstract_factory;

public class EnglishBreakfast implements Breakfast {

    @Override
    public void prepare() {
        System.out.println("English breakfast is prepared");
    }
}
