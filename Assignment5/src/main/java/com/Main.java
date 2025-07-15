package com;

public class Main {

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue(new Animal.Dog(1, "Richie"));
        shelter.enqueue(new Animal.Cat(2, "Ivy"));
        shelter.enqueue(new Animal.Dog(3, "Daisy"));
        shelter.enqueue(new Animal.Cat(4, "Muffy"));

        // Dequeue any animal //
        System.out.println("Dequeue any: " + shelter.dequeueAny().getName());

        // Dequeue a dog //
        System.out.println("Dequeue dog: " + shelter.dequeueDog().getName());

        // Dequeue a cat
        System.out.println("Dequeue cat: " + shelter.dequeueCat().getName());

        // Check if the shelter is empty
        System.out.println("Is shelter empty? " + shelter.isEmpty());
    }
}
