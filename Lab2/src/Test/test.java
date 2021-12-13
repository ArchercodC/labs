package Test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import Classes.Cat;

@SuppressWarnings("ALL")
public class test {

    @org.testng.annotations.Test(dataProvider = "soundProvider")
    public void SoundTest(String s, String res) { assertEquals(cat.getSound(s),res);};

    @DataProvider
    public Object[][] soundProvider() { return new Object[][] {{"Meow", "Cat goes Meow"}};}

    Cat.CatBuilder builder = new Cat.CatBuilder();
    Cat cat = new Cat("Thomas", 12, "Grey", "Scottish Fold");
}
