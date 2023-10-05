import java.util.Scanner;

public class WhatToWear {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Gather user input
        System.out.print("Enter the weather conditions (e.g., rainy, sunny, cloudy, snow): ");
        String weather = scanner.nextLine().toLowerCase();

        System.out.print("Enter the average temperature for the day: ");
        int temperature = scanner.nextInt();

        // Define clothing suggestions based on weather and temperature
        if (weather.equals("rainy") && temperature < 12) {
            System.out.println("Wear a waterproof winter coat.");
        } else if (weather.equals("rainy")) {
            System.out.println("Wear a waterproof jacket or carry an umbrella.");
        } else if (weather.equals("sunny") && temperature >= 28) {
            System.out.println("Wear a light t-shirt and sunglasses.");
        } else if (weather.equals("sunny") && temperature >= 18) {
            System.out.println("Wear a t-shirt and sunscreen.");
        } else if (weather.equals("sunny")) {
            System.out.println("Wear sunglasses and sunscreen.");
        } else if (weather.equals("cloudy") && temperature < 18) {
            System.out.println("Wear a light jacket.");
        } else if (weather.equals("cloudy")) {
            System.out.println("Wear a long-sleeve shirt.");
        } else if (weather.equals("snow") && temperature < 0) {
            System.out.println("Wear a heavy winter coat, gloves, and a hat.");
        } else if (weather.equals("snow")) {
            System.out.println("Wear a winter coat and warm clothing.");
        } else {
            System.out.println("Sorry, I don't have a clothing suggestion for these conditions.");
        }
    }
}
