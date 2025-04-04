package org.example;

class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount - amount >= 0) {
            foodAmount -= amount;
        }
    }
    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println(amount + " еды добавлено в миску. Теперь в миске " + foodAmount + " еды.");
    }
}