package AbstractFactory;

public class IraqGardenCreator implements GardenCreator {
    @Override
    public Tree createTree() {
        return new ShajarahTree();
    }

    @Override
    public Flower createFlower() {
        return new VardahFlower();
    }
}
