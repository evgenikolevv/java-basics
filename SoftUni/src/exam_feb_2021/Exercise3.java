package exam_feb_2021;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String dessert = console.nextLine();
        int numberOfDesserts = Integer.parseInt(console.nextLine());
        int day = Integer.parseInt(console.nextLine());
        double price = 0;
        if(day <= 15){
            switch (dessert){
                case "Cake":
                    price = 24;
                    break;
                case "Souffle":
                    price = 6.66;
                    break;
                case "Baklava":
                    price = 12.60;
                    break;
            }
        }else if (day > 15){
            switch (dessert){
                case "Cake":
                    price = 28.70;
                    break;
                case "Souffle":
                    price = 9.80;
                    break;
                case "Baklava":
                    price = 16.98;
                    break;
            }
        }

        double cost = price * numberOfDesserts;
        if (day <= 22){


        if (cost >= 100 && cost <= 200){
            //15 %
            double discount = cost * 0.15;
            cost -= discount;
        }else if (cost > 200){
            double discount = cost * 0.25;
            cost -= discount;
        }

        if (day <= 15){
            // more discount 10%
            double discount = cost * 0.10;
            cost -= discount;
        }
        }
        System.out.printf("%.2f",cost);
    }
}
