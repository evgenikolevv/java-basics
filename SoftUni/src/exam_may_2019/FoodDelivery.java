package exam_may_2019;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double chickenMenu = Integer.parseInt(console.nextLine()) * 10.35;
        double fishMenu = Integer.parseInt(console.nextLine()) * 12.40;
        double vegetarianMenu = Integer.parseInt(console.nextLine()) * 8.15;

        double sum = chickenMenu + fishMenu + vegetarianMenu;
        double dessert = sum * 0.20;
        sum += dessert;
        sum += 2.50;
        System.out.printf("Total: %.2f",sum);
    }
}
