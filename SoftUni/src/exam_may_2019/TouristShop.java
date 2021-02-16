package exam_may_2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String input = "";
        double priceOfProduct = 0;
        String name = "";
        double cost = 0;
        int count = 1;
        while (true){
            input = console.nextLine();
            if( input.equals("Stop")){
                System.out.printf("You bought %d products for %.2f leva.",count-1,cost);
                break;
            }
            name = input;
            priceOfProduct = Double.parseDouble(console.nextLine());
            if (count % 3 == 0){
                priceOfProduct /= 2;
            }
            cost += priceOfProduct;
            if (cost > budget){
                double diff = Math.abs(cost - budget);
                System.out.printf("You don't have enough money!\nYou need %.2f leva!",diff);
                break;
            }
            count++;
        }
    }
}
