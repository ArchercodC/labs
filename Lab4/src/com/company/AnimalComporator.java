package com.company;
import java.util.Comparator;

public class AnimalComporator implements Comparator<Animal>
{
    @Override
    public int compare(Animal one, Animal two)
    {
        return one.compareTo(two);
    }
}