package com;

import model.Animal;
import model.Animal.Cat;
import model.Animal.Dog;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AnimalShelter {

    public Queue<Animal.Dog> dogQueue;
    public Queue<Animal.Cat> catQueue;
    public Stack<AnimalShelter> animalStack;
    public int orderNumber = 0;

    public AnimalShelter() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        animal.setOrderNumber(orderNumber++);
        if (animal instanceof Dog) {
            dogQueue.add((Dog) animal);
        } else if (animal instanceof Cat) {
            catQueue.add((Cat) animal);
        }

    }

    public Animal dequeueAny() {
        if (dogQueue.isEmpty()) return dequeueCat();
        if (catQueue.isEmpty()) return dequeueDog();

        Dog oldestDog = dogQueue.peek();
        Cat oldestCat = catQueue.peek();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Animal dequeueDog() {
        return dogQueue.poll();
    }

    public Animal dequeueCat() {
        return catQueue.poll();
    }

    public boolean isEmpty() {
        return dogQueue.isEmpty() && catQueue.isEmpty();
    }

}
