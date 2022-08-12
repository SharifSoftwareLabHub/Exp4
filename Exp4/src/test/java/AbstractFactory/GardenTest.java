package AbstractFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GardenTest {
    private IranianGardenCreator iranianGardenCreator;
    private IraqGardenCreator iraqGardenCreator;

    @Before
    public void beforeTest() {
        iranianGardenCreator = new IranianGardenCreator();
        iraqGardenCreator = new IraqGardenCreator();
    }

    @Test
    public void createTreesTest() {
        Assert.assertTrue(iranianGardenCreator.createTree() instanceof SarvTree);
        Assert.assertTrue(iraqGardenCreator.createTree() instanceof ShajarahTree);
    }

    @Test
    public void createFlowersTest() {
        Assert.assertTrue(iranianGardenCreator.createFlower() instanceof LalehFlower);
        Assert.assertTrue(iraqGardenCreator.createFlower() instanceof VardahFlower);
    }
}
