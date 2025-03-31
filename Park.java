package org.example;

public class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name, int capacity) {
        this.name = name;
        this.attractions = new Attraction[capacity];
    }
    public void addAttraction(int index, String name, String operatingHours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, operatingHours, price);
        } else {
            System.out.println("Недопустимый индекс для аттракциона.");
        }
    }
    public void showAttractions() {
        System.out.println("Аттракционы в парке " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.showInfo();
            }
        }
    }
    private class Attraction {
        private String name; //
        private String operatingHours;
        private double price;

        public Attraction(String name, String operatingHours, double price) {
            this.name = name;
            this.operatingHours = operatingHours;
            this.price = price;
        }
        public void showInfo() {
            System.out.println("\nНазвание: " + name);
            System.out.println("Время работы: " + operatingHours);
            System.out.println("Стоимость: " + price + " Руб.");
        }
    }
    public static void main(String[] args) {
        Park park = new Park("Port Aventura", 5);
        park.addAttraction(0, "Американские горки Dragon Khan", "10:00 - 22:00", 500);
        park.addAttraction(1, "Водные горки Tutuki Splash", "10:00 - 22:00", 400);
        park.addAttraction(2, "Качель Kontiki", "10:00 - 22:00", 300);

        park.showAttractions();
    }
}

