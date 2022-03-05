package com.company.Day21.Task3;

public class MaIn {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Cat cat = new Cat();
        System.out.print("animal " + animal.age);
        System.out.print(animal.name);
        animal.sound();
        System.out.print("cat " + cat.age);
        System.out.print(cat.name);
        cat.sound();
        System.out.print("animal1 " + animal1.age);
        System.out.print(animal1.name);
        animal1.sound();
    }
}
