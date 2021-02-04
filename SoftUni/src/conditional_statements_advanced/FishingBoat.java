package conditional_statements_advanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int budget = console.nextInt();
        String season = console.next();
        int numberOfFishers = console.nextInt();

        //цена според сезона
        double price = 0;

        if(season.equals("Spring")){
            price = 3000;
        }else if (season.equals("Summer") || season.equals("Autumn")){
            price = 4200;
        }else if (season.equals("Winter")){
            price = 2600;
        }

        if (numberOfFishers <= 6){
            price -= price * 0.10;
        }else if (numberOfFishers >=7 && numberOfFishers <= 11){
            price -= price * 0.15;
        }else if (numberOfFishers >=12){
            price -= price * 0.25;
        }

        if (numberOfFishers % 2 == 0 && !(season.equals("Autumn"))){
            price -= price * 0.05;
        }

        double result = Math.abs(price - budget);
        if (price <= budget){
            System.out.printf("Yes! You have %.2f leva left.",result);
        }else if(price > budget){
            System.out.printf("Not enough money! You need %.2f leva.",result);
        }

    }
}
