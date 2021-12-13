import org.checkerframework.checker.units.qual.A;

import javax.lang.model.element.Name;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.File;

public class Main
{
    public static void main(String[] args) {
        Animal Cat = new Animal();
        Cat.setName("Thomas");
        Cat.setAge(18);
        Cat.setColor("Grey");
        Cat.setBreed("Scottish Fold");
        Cat.setArt("Cat");

        Animal Dog = new Animal();
        Dog.setName("Alex");
        Dog.setAge(14);
        Dog.setColor("Black");
        Dog.setBreed("Pomeranian");
        Dog.setArt("Dog");

        Animal Rat = new Animal();
        Rat.setName("Anton");
        Rat.setAge(5);
        Rat.setColor("White");
        Rat.setBreed("Husky");
        Rat.setArt("Rat");

        SerializeTXT srzTxt = new SerializeTXT();
        SerializeJSON srzJson = new SerializeJSON();
        SerializeXML srzXml = new SerializeXML();
        File fTxt = new File("Animal.txt");
        File fJson = new File("Animal.json");
        File fXml = new File("Animal.xml");

        try
        {
            srzTxt.serializer(Cat, fTxt);
            srzJson.serializer(Dog, fJson);
            srzXml.serializer(Rat, fXml);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        Animal CatTxt = new Animal();
        Animal DogJson = new Animal();
        Animal RatXml = new Animal();

        try
        {

            CatTxt = srzTxt.deserializer(fTxt);
            DogJson = srzJson.deserializer(fJson);
            RatXml = srzXml.deserializer(fXml);
        } catch (Exception e)
        {

            System.out.println(e.getMessage());
        }

        System.out.println(CatTxt);
        System.out.println(DogJson);
        System.out.println(RatXml);


    }
}