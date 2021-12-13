package com.company;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Animal> animals =  new ArrayList<Animal>();
        Animal Cat = new Animal();
        Cat.setName("Thomas");
        Cat.setAge(18);
        Cat.setColor("Black");
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

        animals.add(Cat);
        animals.add(Dog);
        animals.add(Rat);

        AnimalShelter shelter = new AnimalShelter.Builder().SetList(animals).SetCollectionName("animals1").build();

        String sorted;
        sorted = "";
        for (var item : shelter.SortAnimalByArt()) {
            sorted += item.toString() + "\n";
        }
        System.out.println(sorted + "\n");

        String sortedStream;
        sortedStream = "";
        for (var item : shelter.SortAnimalByArtStream()) {
            sortedStream += item.toString() + "\n";
        }
        System.out.println(sortedStream + "\n");

        String filtered;
        filtered = "";
        for (var item : shelter.FilterAge(10)) {
            filtered += item.toString() + "\n";
        }
        System.out.println(filtered + "\n");

        String filteredStream;
        filteredStream = "";
        for (var item : shelter.FilterAgeStream(10)) {
            filteredStream += item.toString() + "\n";
        }
        System.out.println(filteredStream + "\n");

        String find;
        find = "";
        for (var item : shelter.getAnimalListByColor("Black")) {
            find += item.toString() + "\n";
        }
        System.out.println(find + "\n");

        String findStream;
        findStream = "";
        for (var item : shelter.getAnimalListByColorStream("Black")) {
            findStream += item.toString() + "\n";
        }
        System.out.println(findStream + "\n");
    }
}
