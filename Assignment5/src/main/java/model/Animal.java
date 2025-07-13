package model;

abstract class Animal {

    private int orderNumber;
    private String name;

    public Animal(int orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }

    // Getters and Setters //
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOlderThan(Animal a) {
        return this.orderNumber < a.orderNumber;
    }

    class Dog extends Animal {
        public Dog(int orderNumber, String name) {
            super(orderNumber, name);
        }
    }

    class Cat extends Animal {
        public Cat(int orderNumber, String name) {
            super(orderNumber, name);
        }
    }
}

