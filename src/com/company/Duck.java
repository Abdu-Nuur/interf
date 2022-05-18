package com.company;

public class Duck extends WaterAnimal implements Swimable{
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Sunun ustundo gana jashai alat");
    }
}
