package AbstractFactory;

public class SarvTree implements Tree {
    private final String fruit = "Sarv Fruit";

    @Override
    public String getFruit() {
        return this.fruit;
    }
}
