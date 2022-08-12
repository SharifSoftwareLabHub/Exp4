package AbstractFactory;

public class LalehFlower implements Flower {
    private final String smell = "Laleh Smell!";
    @Override
    public String getSmell() {
        return this.smell;
    }
}
