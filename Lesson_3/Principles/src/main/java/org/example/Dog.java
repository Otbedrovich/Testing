package org.example;

class Dog extends Animal {
    private static int dogCount = 0;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("\nПёс " + name + " пробежал/пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать такую дистанцию.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл/проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть такую дистанцию");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}
