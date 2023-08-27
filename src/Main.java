import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What's the product's price?");
            double price = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What's the quantity you'd like to purchase?");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            double initRev = price * quantity;
            double firstDisc;
            double secondDisc;

            if (quantity >= 100 && quantity <= 120) {
                firstDisc = initRev * 0.15;
                System.out.println("The revenue from the sale: " + (initRev - firstDisc) + "$");
                System.out.println("Discount: " + (firstDisc) + "$");
            } else if (quantity >= 121) {
                secondDisc = initRev * 0.20;
                System.out.println("The revenue from the sale: " + (initRev - secondDisc) + "$");
                System.out.println("Discount: " + (secondDisc) + "$");
            } else {
                System.out.println("The revenue from sale: " + initRev + "$");
                System.out.println("No discount applied.");
            }
            System.out.println("Would you like to check another product? (yes/no)");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("yup")) {
                break;
            }
        }
    }
}