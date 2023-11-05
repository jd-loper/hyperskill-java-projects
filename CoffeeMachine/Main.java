package CoffeeMachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int numCups = scanner.nextInt();

        printIngredients(numCups);

        scanner.close();
    }

    public static void printIngredients(int numCups) {
        int waterPerCupML = 200;
        System.out.println(numCups * waterPerCupML + " ml of water");
        int milkPerCupML = 50;
        System.out.println(numCups * milkPerCupML + " ml of milk");
        int beansPerCupML = 15;
        System.out.println(numCups * beansPerCupML + " g of coffee beans");
    }
}
