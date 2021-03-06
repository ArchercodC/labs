import com.fasterxml.jackson.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class SerializeXML
{
    XmlMapper mapper;

    public SerializeXML()
    {
        mapper = new XmlMapper();
    }

    public void serializer(Animal obj, File file) throws IOException
    {
        try
        {
            mapper.writeValue(file, obj);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Animal  deserializer(File file) throws RuntimeException
    {
        try
        {
            return mapper.readValue(file, Animal.class);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
}