package com.controlwork;

import java.util.Random;
//Гусев Алексей 11-306 Вариант 2

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        Pet[] pets = new Pet[5]; // массив из 5 питомцев

        for (int i = 0; i < pets.length; i++) {
            if (random.nextBoolean()) { // рандомно: собака или кошка
                pets[i] = new Dog(random.nextInt(100) + 1); // рандомная сытость от 1 до 100
            } else {
                pets[i] = new Cat(random.nextInt(100) + 1);
            }
        }

        // вывод состояния питомцев до начала кормления
        System.out.println("Сытость питомцев до кормления:");
        for (Pet pet : pets) {
            System.out.println(pet.getClass().getSimpleName() + " hunger: " + pet.hunger);

        }
        System.out.println();

        // кормим всех питомцев
        for (Pet pet : pets) {
            pet.eat();
        }

        System.out.println();

        // вывод состояния питомцев после кормления
        System.out.println("Состояние питомцев после обеда:");
        for (Pet pet : pets) {
            System.out.println(pet.getClass().getSimpleName() + " hunger: " + pet.hunger);

        }
        System.out.println();
    }
}