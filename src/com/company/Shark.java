package com.company;

public class Shark extends WaterAnimal implements Swimable{
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Sunun ichinde gana jashai alat");
    }
}
