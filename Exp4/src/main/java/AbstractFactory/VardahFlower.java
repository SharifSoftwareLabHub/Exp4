package AbstractFactory;

public class VardahFlower implements Flower {
    private final String smell = "Vardeh Smell!";
    @Override
    public String getSmell() {
        return this.smell;
    }
}
