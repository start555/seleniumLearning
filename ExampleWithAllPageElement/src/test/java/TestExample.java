import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestExample extends TestBase{

    @Test
    public void checkExpectedElementsWithoutVarargs(){
        Assert.assertTrue(HomePage.checkExpectedElementsWithoutVarargs(driver));
    }

    @Test
    public void checkExpectedElementsWithVarargs(){
        Assert.assertTrue(HomePage.checkExpectedElementsWithVarargs(driver));
    }
}
