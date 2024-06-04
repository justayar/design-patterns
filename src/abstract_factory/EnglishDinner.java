package abstract_factory;

public class EnglishDinner implements Dinner {

    @Override
    public void prepare() {
        System.out.println("English dinner is prepared");
    }
}
