import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create instances of the Food class with user input for the type
        System.out.print("Enter the name of a fruit: ");
        String fruitName = scanner.nextLine();
        Food fruit = new Food(fruitName, "fruit");

        System.out.print("Enter the name of a meat: ");
        String meatName = scanner.nextLine();
        Food meat = new Food(meatName, "meat");

        System.out.print("Enter the name of a vegetable: ");
        String vegetableName = scanner.nextLine();
        Food vegetable = new Food(vegetableName, "vegetable");

        // Add them to the picnicBasket array
        Food[] picnicBasket = {fruit, meat, vegetable};

        // Ask the user what type of food they don't like
        System.out.print("What type of food don't you like? ");
        String dislikedFoodType = scanner.nextLine().toLowerCase();

        // Iterate through each food in the picnic basket
        for (Food food : picnicBasket) {
            // Check if the disliked food type matches the current food type
            if (dislikedFoodType.equals(food.getType().toLowerCase())) {
                System.out.println("You didn't eat " + food.getType() + "!");
            } else {
                // Make a decision based on the food type
                if ("vegetable".equals(food.getType())) {
                    System.out.println(food.denyIt());
                } else {
                    System.out.println(food.eatIt());
                }
            }
        }






    }
}