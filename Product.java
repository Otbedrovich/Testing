package org.example;

public class Product{
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean reserved;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean reserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reserved = reserved;

    }
    public void info () {
        System.out.println("\nНазвание: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования: " + (reserved ? true : false));
    }
    public static void main (String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung Galaxy S25 Ultra", "07.02.2025", "Samsung Corp", "Korea", 5599, true);
        productsArray[1] = new Product("Nothing phone 2", "26.07.2023", "Nothing Technology Limited", "Great Britain", 1869, false);
        productsArray[2] = new Product("iPhone 14", "16.09.2022", "Apple inc", "USA", 2493, true);
        productsArray[3] = new Product("Google Pixel 9", "22.08.2024", "Google LLC", "USA", 3792, true);
        productsArray[4] = new Product("OnePlus 13", "7.01.2025", "OnePlus Technology", "China", 3000, false);

        for (Product product : productsArray) {
        product.info();
        }
    }
}

