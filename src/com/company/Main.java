package com.company;

public class Main {

    public static void main(String[] args) {

        Akvarium akvarium = new Akvarium(new Shark[]{
                new Shark("dad",23),
                new Shark("mom",20),
                new Shark("syn",10)},
                new Duck[]{
                        new Duck("donal",34),
                new Duck("dag",23),
                new Duck("gad",13)},
                new Turtle[]{
                        new Turtle("miki",15),
                new Turtle("ben",12),
                new Turtle("lung",9)});

        System.out.println(akvarium);


    }
}
