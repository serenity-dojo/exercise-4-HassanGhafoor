package com.serenitydojo;

public class Dog {

    private String name;
    private String FavouriteToy;
    private int age;

    private final static String dogSound = "Woof";

    private final Boolean isfed = true;

    public Dog(String name, String FavouriteToy, int age) {
        this.name = name;
        this.FavouriteToy = FavouriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return FavouriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return dogSound;
    }

    public boolean isFed() {
        return isfed;
    }
}
