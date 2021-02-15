package exam__april_2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfEasterCakes = Integer.parseInt(console.nextLine());
        int sugar = 0;
        int flour = 0;
        int maxSugar = 0;
        int maxFlour = 0;
        double neededSugar = 0;
        double neededFlour = 0;
        for (int i = 0; i < numberOfEasterCakes; i++) {
            sugar = Integer.parseInt(console.nextLine());
            flour = Integer.parseInt(console.nextLine());
            neededSugar += sugar;
            neededFlour += flour;
            if (maxSugar < sugar) {
                maxSugar = sugar;
            }
            if (maxFlour < flour) {
                maxFlour = flour;
            }
        }

        neededFlour =  Math.ceil(neededFlour / 750);
        neededSugar = Math.ceil(neededSugar / 950);
        System.out.printf("Sugar: %.0f\n", neededSugar);
        System.out.printf("Flour: %.0f\n", neededFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);

    }
}
