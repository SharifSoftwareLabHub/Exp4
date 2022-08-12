package AbstractFactory;

public class IranianGardenCreator implements GardenCreator {
    @Override
    public Tree createTree() {
        return new SarvTree();
    }

    @Override
    public Flower createFlower() {
        return new LalehFlower();
    }
}
