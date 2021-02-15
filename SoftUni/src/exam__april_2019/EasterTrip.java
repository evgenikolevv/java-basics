package exam__april_2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String destination = console.nextLine();
        String reservation = console.nextLine();
        int days = Integer.parseInt(console.nextLine());
        double price = 0;
        double cost = 0;

        if (destination.equals("France")){
            switch (reservation){
                case "21-23":
                    price = 30;
                    break;
                case "24-27":
                    price = 35;
                    break;
                case "28-31":
                    price = 40;
                    break;
            }

        }else if (destination.equals("Italy")){
            switch (reservation){
                case "21-23":
                    price = 28;
                    break;
                case "24-27":
                    price = 32;
                    break;
                case "28-31":
                    price = 39;
                    break;
            }

        }else if (destination.equals("Germany")){
            switch (reservation){
                case "21-23":
                    price = 32;
                    break;
                case "24-27":
                    price = 37;
                    break;
                case "28-31":
                    price = 43;
                    break;
            }
        }

        cost = days * price;
        System.out.printf("Easter trip to %s : %.2f leva.",destination,cost);
    }
}
