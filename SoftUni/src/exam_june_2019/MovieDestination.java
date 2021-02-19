package exam_june_2019;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String destination = console.nextLine();
        String season = console.nextLine();
        int days = Integer.parseInt(console.nextLine());

        double price = 0;
        double cost = 0;
        if (destination.equals("Dubai")) {
            switch (season) {
                case "Winter":
                    price = 45000;
                    break;
                case "Summer":
                    price = 40000;
                    break;
            }
        } else if (destination.equals("Sofia")) {
            switch (season) {
                case "Winter":
                    price = 17000;
                    break;
                case "Summer":
                    price = 12500;
                    break;
            }

        } else if (destination.equals("London")) {
            switch (season) {
                case "Winter":
                    price = 24000;
                    break;
                case "Summer":
                    price = 20250;
                    break;
            }
        }
        cost = days * price;
        if (destination.equals("Sofia")){
            double increase = cost * 0.25;
            cost += increase;
        }else if (destination.equals("Dubai")){
            double discount = cost * 0.30;
            cost -= discount;
        }

        if (budget >= cost){
            double diff = budget - cost;
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",diff);
        }else {
            double diff = Math.abs(cost - budget);
            System.out.printf("The director needs %.2f leva more!",diff);
        }
    }
}
