package com.company;

public class Turtle extends WaterAnimal implements Swimable{
    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Sunun ichinde jana ustundo jashai alat");
    }
}
