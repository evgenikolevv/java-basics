package exam_july_2020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double price = Double.parseDouble(console.nextLine());
        double kilograms = Double.parseDouble(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int numberOfBags = Integer.parseInt(console.nextLine());
        double overprice = 0;

        if (kilograms < 10) {
            price *= 0.20;
            if (days < 7) {
                overprice = price * 0.40;
                price += overprice;
                price *= numberOfBags;
            } else if (days >= 7 && days <= 30) {
                overprice = price * 0.15;
                price += overprice;
                price *= numberOfBags;

            } else if (days > 30) {
                overprice = price * 0.10;
                price += overprice;
                price *= numberOfBags;
            }
        } else if (kilograms >= 10 && kilograms <= 20) {
            price *= 0.50;
            if (days < 7) {
                overprice = price * 0.40;
                price += overprice;
                price *= numberOfBags;
            } else if (days >= 7 && days <= 30) {
                overprice = price * 0.15;
                price += overprice;
                price *= numberOfBags;

            } else if (days > 30) {
                overprice = price * 0.10;
                price += overprice;
                price *= numberOfBags;
            }

        } else if (kilograms > 20) {

            if (days < 7) {
                overprice = price * 0.40;
                price += overprice;
                price *= numberOfBags;
            } else if (days >= 7 && days <= 30) {
                overprice = price * 0.15;
                price += overprice;
                price *= numberOfBags;

            } else if (days > 30) {
                overprice = price * 0.10;
                price += overprice;
                price *= numberOfBags;
            }
        }
        System.out.printf("The total price of bags is: %.2f lv.", price);
    }
}
