package conditional_statements_advanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = console.nextDouble();
        String season = console.next();
        String place = "";
        String placeToStay = "";
        double finalCost = 0;
        double discount = 0;

        if(budget <= 100){
            place = "Bulgaria";
            if(season.equals("summer")){
                discount = budget * 0.30;
                finalCost = budget - discount;
                finalCost -= budget;
                placeToStay = "Camp";
            }else if (season.equals("winter")){
                discount -= budget * 0.70;
                finalCost = budget - discount;
                finalCost -= budget;
                placeToStay = "Hotel";
            }
        }else if (budget <= 1000){
            place = "Balkans";
            if(season.equals("summer")){
                discount = budget * 0.40;
                finalCost = budget - discount;
                finalCost -= budget;
                placeToStay = "Camp";
            }else if (season.equals("winter")){
                discount = budget * 0.80;
                finalCost = budget - discount;
                finalCost -= budget;
                placeToStay = "Hotel";
            }
        }else if (budget > 1000){
            place = "Europe";
            placeToStay = "Hotel";
            finalCost = budget * 0.90;
        }

        System.out.printf("Somewhere in %s\n%s - %.2f",place,placeToStay,Math.abs(finalCost));
    }
}
