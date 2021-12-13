package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();

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

        Animal[] animals = new Animal[3];

        animals[0] = Cat;
        animals[1] = Dog;
        animals[2] = Rat;

        db.executeSQL("CREATE TABLE Animals (Id INT PRIMARY KEY AUTO_INCREMENT, Name NVARCHAR(30), Age INT, Art NVARCHAR(30), Breed NVARCHAR(30), Color NVARCHAR(30));");
        for (var item : animals) {
            db.executeSQL("INSERT INTO Animals (Name, Age, Art, Breed, Color) VALUES "
                    + String.format("('%s', %d, '%s', '%s', '%s');", item.getName(), item.getAge(), item.getArt(),
                    item.getBreed(), item.getColor()));
        }

        try {
            ResultSet res = db.executeSQLWithResult("SELECT * FROM Animals");
            System.out.println("Animals : ");
            while (res.next()) {
                System.out.println(res.getString("Id") + ", "
                        + res.getString("Name") + ", "
                        +res.getString("Art") + ", "
                        + res.getString("Age") + ", "
                        + res.getString("Color") + ", ");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

}