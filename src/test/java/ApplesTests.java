import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Total number of apples: ");
    }

    // Test 2: Filter green apples
    @Test
    public void testFilterGreenApples() {
        System.out.println("Green apples: ");
    }

    // Test 3: Find the cheapest apple
    @Test
    public void testFindCheapestApple() {
        System.out.println("Cheapest apple: ");
    }

    // Test 4: Find the most expensive apple
    @Test
    public void testFindMostExpensiveApple() {
        System.out.println("Most expensive apple: ");
    }

    // Test 5: Calculate the total price of all apples
    @Test
    public void testCalculateTotalPrice() {
        System.out.println("Total price of all apples: ");
    }

    // Test 6: Find the average price of apples
    @Test
    public void testCalculateAveragePrice() {
        System.out.println("Average price of apples: ");
    }

    // Test 7: Group apples by color
    @Test
    public void testGroupApplesByColor() {
        System.out.println("Apples grouped by color: ");
    }

    // Test 8: Calculate the total price of green apples
    @Test
    public void testCalculateTotalPriceOfGreenApples() {
        System.out.println("Total price of green apples: ");
    }

    // Test 9: Find the average price of green apples
    @Test
    public void testCalculateAveragePriceOfGreenApples() {
        System.out.println("Average price of green apples: ");
    }

    // Test 10: Find the most expensive green apple
    @Test
    public void testFindMostExpensiveGreenApple() {
        System.out.println("Most expensive green apple: ");
    }

    // Test 11: Find the cheapest red apple
    @Test
    public void testFindCheapestRedApple() {
        System.out.println("Cheapest red apple: ");
    }

    // Test 12: Find the total count of each color of apples
    @Test
    public void testCountApplesByColor() {
        System.out.println("Count of apples by color: ");
    }

    // Test 13: Find the total count of apples having price greater than 0.7
    @Test
    public void testCountApplesWithPriceGreaterThanPointSeven() {
        System.out.println("Number of apples with price greater than 0.7: ");
    }

    // Test 14: Find the sum of prices of apples having price less than 0.8
    @Test
    public void testCalculateTotalPriceOfApplesWithPriceLessThanPointEight() {
        System.out.println("Total price of apples with price less than 0.8: ");
    }

    // Test 15: Concatenate colors of all apples
    @Test
    public void testConcatenateColorsOfAllApples() {
        System.out.println("Concatenated colors of all apples: ");
    }

}
