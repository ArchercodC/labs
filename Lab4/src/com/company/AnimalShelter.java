package com.company;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class AnimalShelter extends Animal
{
    private String CollectionName;
    private List<Animal> AnimalList;
    public String getCollection()
    {
        return CollectionName;
    }

//    public  void SetTeamName (String TeamName)
//    {
//        this.TeamName = TeamName;
//    }


    public List<Animal> getSportsmanList()
    {
        return AnimalList;
    }



    public static class Builder
    {
        private AnimalShelter newShelter;

        public Builder()
        {
            newShelter = new AnimalShelter();
        }

        public AnimalShelter.Builder SetName(String name) {
            newShelter.Name = name;
            return this;
        }

        public AnimalShelter.Builder SetAge(int age) {
            newShelter.Age = age;
            return this;
        }

        public AnimalShelter.Builder SetArt(String art) {
            newShelter.Art = art;
            return this;
        }

        public AnimalShelter.Builder SetColor(String color) {
            newShelter.Color = color;
            return this;
        }

        public AnimalShelter.Builder SetBreed(String breed) {
            newShelter.Breed = breed;
            return  this;
        }

        public AnimalShelter.Builder SetList(List<Animal> list) {
            newShelter.AnimalList = list;
            return this;
        }

        public AnimalShelter.Builder SetCollectionName(String collectionName) {
            newShelter.CollectionName = collectionName;
            return this;
        }

        public AnimalShelter build() {
            return newShelter;
        }

    }


    public List<Animal> SortAnimalByArt()
    {
        AnimalList.sort( new AnimalComporator());
        return AnimalList;
    }

    public List<Animal> SortAnimalByArtStream()
    {
        return AnimalList.stream().sorted(new AnimalComporator()).toList();
    }

    public List<Animal> FilterAge(int age)
    {
        List<Animal> list = new ArrayList<>();
        for (var item : AnimalList)
        {
            if (item.getAge() >= age)
            {
                list.add(item);
            }
        }
        return list;
    }

    public List<Animal> FilterAgeStream(int age)
    {
        return AnimalList.stream().filter(a -> a.getAge() >= age).toList();
    }


    public List<Animal> getAnimalListByColor(String color)
    {
        List<Animal> list = new ArrayList<Animal>();
        for (var item : AnimalList)
        {
            if (item.getColor() == color)
            {
                list.add(item);
            }
        }
        return list;
    }

    public List<Animal> getAnimalListByColorStream(String color)
    {
        return AnimalList.stream().filter(a->a.Color == color).toList();
    }

}