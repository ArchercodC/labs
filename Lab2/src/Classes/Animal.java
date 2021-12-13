package Classes;

public abstract class Animal {

    protected String Name;
    protected int Age;
    protected String Color;
    protected String Breed;

    /**
     * @return specific sound
     */
    public abstract String getSound(String sound);

}
