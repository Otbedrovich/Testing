package org.example;

public class PetSimulation {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(10);

        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Чёрный")
        };

        for (Cat cat : cats) {
            cat.run(15);
            cat.swim(10);
            cat.eat(bowl, 5);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытый: " + cat.bowlIsFull);
        }
        bowl.addFood(10);

        Dog[] dogs = {
                new Dog("Шарик"),
                new Dog("Бобик")
        };
        for (Dog dog : dogs) {
            dog.run(300);
            dog.swim(5);
        }
        System.out.println("\nКоличество созданных животных: " + Animal.getAnimalCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("Количество созданных котов: " + Cat.getCatCount());
    }
}