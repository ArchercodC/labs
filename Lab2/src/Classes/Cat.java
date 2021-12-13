package Classes;

public class Cat extends Animal {

    public Cat(String name, int age, String color, String breed){
        this.Name = name;
        this.Age = age;
        this.Color = color;
        this.Breed = breed;
    }

    Cat(CatBuilder builder){
        this.Name = builder.Name;
        this.Age = builder.Age;
        this.Color = builder.Color;
        this.Breed = builder.Breed;
    }

    /**
     * @return the sound
     */
    @Override
    public String getSound(String sound) {
        return "Cat goes " + sound;
    }

    /**
     * @return string combined with Name and Age
     */
    @Override
    public String toString() {
        return String.format(this.Name + this.Age);
    }

    /**
     * @return length of object name
     */
    @Override
    public int hashCode() {
        return Name.length();
    }

    /**
     * @param o any object
     * @return true if incoming object is instance of class cat
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cat)){
            return false;
        }

        Cat cat = (Cat)o;

        return cat.Name.equals(this.Name) &&
                cat.Age == this.Age;
    }

    public static class CatBuilder {
        protected String Name;
        protected int Age;
        protected String Color;
        protected String Breed;

        /**
         * @param name cat name
         * @return object with changed name
         */
        public CatBuilder SetName(String name){
            Name = name;
            return this;
        }

        /**
         * @param age cat age
         * @return object with changed age
         */
        public CatBuilder SetAge(int age){
            Age = age;
            return this;
        }

        /**
         * @param color cat color
         * @return object with changed color
         */
        public CatBuilder SetColor(String color) {
            Color = color;
            return this;
        }

        /**
         * @param breed cat breed
         * @return object with changed breed
         */
        public CatBuilder SetBreed(String breed) {
            Breed = breed;
            return this;
        }

        /**
         * @param builder cat builder
         * @return create cat object via builder
         */
        public Cat CreateInstance(CatBuilder builder){
            return new Cat(builder);
        }
    }
}
