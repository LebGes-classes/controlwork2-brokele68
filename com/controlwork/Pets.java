package com.controlwork;
import java.util.Random;

abstract class Pet {
    protected int hunger; // сытость питомца

    public Pet(int hunger) {
        this.hunger = hunger;
    }

    public void eat() {
        Random random = new Random();

        System.out.println(sound());
        hunger += random.nextInt(0,76);
        if (hunger > 100) {
            hunger = 100;
        }
    }

    public abstract String sound(); // абстрактный метод
}

class Dog extends Pet {
    public Dog(int hunger) {
        super(hunger);
    }

    @Override
    public String sound() {
        return "Гав!";
    }
}

class Cat extends Pet {
    public Cat(int hunger) {
        super(hunger);
    }

    @Override
    public String sound() {
        return "Мяу!";
    }
}


