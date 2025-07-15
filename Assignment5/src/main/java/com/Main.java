package com;

import model.Animal;

public class Main {

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue(new Animal.Dog(1, "Richie"));
        shelter.enqueue(new Animal.Cat(2, "Lucky"));
        shelter.enqueue(new Animal.Dog(3, "Daisy"));
        shelter.enqueue(new Animal.Cat(4, "Muffy"));
        shelter.enqueue(new Animal.Dog(5, "Buddy"));
        shelter.enqueue(new Animal.Cat(6, "Tiger"));
        shelter.enqueue(new Animal.Cat(7, "Ivy"));

        // Dequeue any animal //
        System.out.println("Dequeue any: " + shelter.dequeueAny().getName());

        // Dequeue a dog //
        System.out.println("Dequeue dog: " + shelter.dequeueDog().getName());

        // Dequeue a cat
        System.out.println("Dequeue cat: " + shelter.dequeueCat().getName());

        // Dequeue another dog //
        System.out.println("Dequeue another dog: " + shelter.dequeueDog().getName());

        // Dequeue another cat //
        System.out.println("Dequeue another cat: " + shelter.dequeueCat().getName());

        // Check if the shelter is empty
        System.out.println("Is shelter empty? " + shelter.isEmpty());
    }
}
