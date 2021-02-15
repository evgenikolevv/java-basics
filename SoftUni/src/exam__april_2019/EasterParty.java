package exam__april_2019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int guests = Integer.parseInt(console.nextLine());
        double priceForPerson = Double.parseDouble(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());
        double money = 0;
        double cake = budget * 0.10;
        double discount = 0;

        if (guests >= 10 && guests <= 15){
            discount = priceForPerson * 0.15;
            priceForPerson -= discount;
        }else if (guests > 15 && guests <= 20){
            discount = priceForPerson * 0.20;
            priceForPerson -= discount;
        }else if (guests > 20){
            discount = priceForPerson * 0.25;
            priceForPerson -= discount;
        }

        money = priceForPerson * guests;
        money += cake;

        if(money < budget){
            double diff = Math.abs(money - budget);
            System.out.printf("It is party time! %.2f leva left.", diff);
        }else if (money >= budget){
            double diff = Math.abs(budget - money);
            System.out.printf("No party! %.2f leva needed.",diff);
        }
    }
}
