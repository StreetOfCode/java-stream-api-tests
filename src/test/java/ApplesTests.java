import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class ApplesTests {
    private final List<Apple> apples = new ArrayList<Apple>();

    @BeforeEach
    public void setUp() {
        this.apples.clear();

        // Initialize list of apples
        apples.addAll(List.of(
                new Apple("red", 0.5),
                new Apple("green", 0.8),
                new Apple("green", 0.6),
                new Apple("red", 0.7),
                new Apple("yellow", 0.9),
                new Apple("red", 0.6)
        ));
    }

    // Test 1: Count the total number of apples
    @Test
    public void testCountApples() {
        long count = apples.stream().count();
        System.out.println("Total number of apples: " + count);
    }

    // Test 2: Filter green apples
    @Test
    public void testFilterGreenApples() {
        List<Apple> greenApples = apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .toList();
        System.out.println("Green apples: " + greenApples);
    }

    // Test 3: Find the cheapest apple
    @Test
    public void testFindCheapestApple() {
        Apple cheapestApple = apples.stream()
                .min(Comparator.comparing(Apple::getPrice))
                .orElse(null);
        System.out.println("Cheapest apple: " + cheapestApple);
    }

    // Test 4: Find the most expensive apple
    @Test
    public void testFindMostExpensiveApple() {
        Apple mostExpensiveApple = apples.stream()
                .max(Comparator.comparing(Apple::getPrice))
                .orElse(null);
        System.out.println("Most expensive apple: " + mostExpensiveApple);
    }

    // Test 5: Calculate the total price of all apples
    @Test
    public void testCalculateTotalPrice() {
        double totalPrice = apples.stream()
                .mapToDouble(Apple::getPrice)
                .sum();
        System.out.println("Total price of all apples: " + totalPrice);
    }

    // Test 6: Find the average price of apples
    @Test
    public void testCalculateAveragePrice() {
        OptionalDouble averagePrice = apples.stream()
                .mapToDouble(Apple::getPrice)
                .average();
        System.out.println("Average price of apples: " + (averagePrice.isPresent() ? averagePrice.getAsDouble() : 0));
    }

    // Test 7: Group apples by color
    @Test
    public void testGroupApplesByColor() {
        Map<String, List<Apple>> applesByColor = apples.stream()
                .collect(Collectors.groupingBy(Apple::getColor));
        System.out.println("Apples grouped by color: " + applesByColor);
    }

    // Test 8: Calculate the total price of green apples
    @Test
    public void testCalculateTotalPriceOfGreenApples() {
        double totalPriceOfGreenApples = apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .mapToDouble(Apple::getPrice)
                .sum();
        System.out.println("Total price of green apples: " + totalPriceOfGreenApples);
    }

    // Test 9: Find the average price of green apples
    @Test
    public void testCalculateAveragePriceOfGreenApples() {
        OptionalDouble averagePriceOfGreenApples = apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .mapToDouble(Apple::getPrice)
                .average();
        System.out.println("Average price of green apples: " + (averagePriceOfGreenApples.isPresent() ? averagePriceOfGreenApples.getAsDouble() : 0));
    }

    // Test 10: Find the most expensive green apple
    @Test
    public void testFindMostExpensiveGreenApple() {
        Apple mostExpensiveGreenApple = apples.stream()
                .filter(apple -> apple.getColor().equals("green"))
                .max(Comparator.comparing(Apple::getPrice))
                .orElse(null);
        System.out.println("Most expensive green apple: " + mostExpensiveGreenApple);
    }

    // Test 11: Find the cheapest red apple
    @Test
    public void testFindCheapestRedApple() {
        Apple cheapestRedApple = apples.stream()
                .filter(apple -> apple.getColor().equals("red"))
                .min(Comparator.comparing(Apple::getPrice))
                .orElse(null);
        System.out.println("Cheapest red apple: " + cheapestRedApple);
    }

    // Test 12: Find the total count of each color of apples
    @Test
    public void testCountApplesByColor() {
        Map<String, Long> countApplesByColor = apples.stream()
                .collect(Collectors.groupingBy(Apple::getColor, Collectors.counting()));
        System.out.println("Count of apples by color: " + countApplesByColor);
    }

    // Test 13: Find the total count of apples having price greater than 0.7
    @Test
    public void testCountApplesWithPriceGreaterThanPointSeven() {
        long count = apples.stream()
                .filter(apple -> apple.getPrice() > 0.7)
                .count();
        System.out.println("Number of apples with price greater than 0.7: " + count);
    }

    // Test 14: Find the sum of prices of apples having price less than 0.8
    @Test
    public void testCalculateTotalPriceOfApplesWithPriceLessThanPointEight() {
        double totalPrice = apples.stream()
                .filter(apple -> apple.getPrice() < 0.8)
                .mapToDouble(Apple::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println("Total price of apples with price less than 0.8: " + totalPrice);
    }

    // Test 15: Concatenate colors of all apples
    @Test
    public void testConcatenateColorsOfAllApples() {
        String concatenatedColors = apples.stream()
                .map(Apple::getColor)
                .reduce("", (color1, color2) -> color1 + ", " + color2)
                .substring(2);
        System.out.println("Concatenated colors of all apples: " + concatenatedColors);
    }

}
