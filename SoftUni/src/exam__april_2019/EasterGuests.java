package exam__april_2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double guests = Integer.parseInt(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());
        double easterCakes = Math.ceil( guests / 3) ;
        double eggs = guests * 2;
        double priceOfEasterCakes = easterCakes * 4;
        double priceOfEggs = eggs * 0.45;
        double money = priceOfEasterCakes + priceOfEggs;

        if (money > budget) {
            double diff = Math.abs(money - budget);
            System.out.printf("Lyubo doesn't have enough money.\nHe needs %.2f lv. more.",diff);
        } else if (money <= budget) {
            double diff = Math.abs(money - budget);
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.\nHe has %.2f lv. left.", easterCakes, eggs, diff);
        }
    }
}
