package org.example;

class Cat extends Animal {
    private static int catCount = 0;
    public boolean bowlIsFull = false;
    private String name;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("\nКот " + name + " пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такую дистанцию.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            this.bowlIsFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println("Кот не может есть, недостаточно еды в миске.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
    public String getName() {
        return name;
    }
}
