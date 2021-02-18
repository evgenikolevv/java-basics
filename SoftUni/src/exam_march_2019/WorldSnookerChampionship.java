package exam_march_2019;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String  step = console.nextLine();
        String typeOfTicket = console.nextLine();
        int numberOfTickets = Integer.parseInt(console.nextLine());
        String picture = console.nextLine();
        double price = 0;
        double cost = 0;
        if(step.equals("Quarter final")){
            switch (typeOfTicket){
                case "Standard":
                    price = 55.50;
                    break;
                case "Premium":
                    price = 105.20;
                    break;
                case "VIP":
                    price = 118.90;
                    break;
            }

        }else if (step.equals("Semi final")){
            switch (typeOfTicket){
                case "Standard":
                    price = 75.88;
                    break;
                case "Premium":
                    price = 125.22;
                    break;
                case "VIP":
                    price = 300.40;
                    break;
            }

        }else if (step.equals("Final")){
            switch (typeOfTicket){
                case "Standard":
                    price = 110.10;
                    break;
                case "Premium":
                    price = 160.66;
                    break;
                case "VIP":
                    price = 400;
                    break;
            }
        }

        cost = price * numberOfTickets;
        if (cost > 4000){
            cost -= cost * 0.25;
        }else{
            if (cost > 2500){
                cost -= cost * 0.10;
            }
            if (picture.equals("Y")){
                cost += numberOfTickets * 40;
            }
        }

        System.out.printf("%.2f",cost);
    }
}
