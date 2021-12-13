public class Animal {

    protected String Name;
    protected String Art;
    protected int Age;
    protected String Color;
    protected String Breed;

    public String getArt() {
        return Art;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getColor() {
        return Color;
    }

    public String getBreed() {
        return Breed;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public void setArt(String art) {
        Art = art;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", Art='" + Art + '\'' +
                ", Age=" + Age +
                ", Color='" + Color + '\'' +
                ", Breed='" + Breed + '\'' +
                '}';
    }
}
