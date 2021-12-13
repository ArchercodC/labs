import java.io.File;
import java.io.*;
import java.io.IOException;

public class SerializeTXT
{
    public void serializer(Animal obj, File file) throws IOException
    {
        try(FileWriter fw = new FileWriter(file)){
            String str = "Name = " + obj.getName()
                    + ",Age = " + obj.getAge()
                    + ",Color = " + obj.getColor()
                    + ",Breed = " + obj.getBreed();
            fw.write(str);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Animal deserializer(File file) throws IOException {
        try (BufferedReader fr = new BufferedReader(new FileReader(file))) {
            String[] fields = fr.readLine().split(",");

            Animal a = new Animal();
            a.setName(fields[0].split(" ")[2]);
            a.setAge(Integer.parseInt(fields[1].split(" ")[2]));
            a.setColor(fields[2].split(" ")[2]);
            a.setBreed(fields[3].split(" ")[2]);
            return a;
        }
        catch (IOException e) {
            throw new RuntimeException("File is empty");
        }
    }
}