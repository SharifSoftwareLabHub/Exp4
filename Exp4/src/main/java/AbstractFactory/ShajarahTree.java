package AbstractFactory;

public class ShajarahTree implements Tree {
    private final String fruit = "Shajarah Fruit";
    @Override
    public String getFruit() {
        return this.fruit;
    }
}
