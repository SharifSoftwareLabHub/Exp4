package AbstractFactory;

public class IranianFlower implements Flower {
    private final String smell = "Iranian Smell!";
    @Override
    public String getSmell() {
        return this.smell;
    }
}
