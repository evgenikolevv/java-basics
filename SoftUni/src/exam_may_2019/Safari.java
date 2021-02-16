package exam_may_2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        double liters = Double.parseDouble(console.nextLine()) * 2.10;
        String day = console.nextLine();
        double money = 0;
        money = 100 + liters;
        if(day.equals("Saturday")){
            // 10% off

            double discount = money * 0.1;
            money -= discount;
        }else if (day.equals("Sunday")){
            //20% off

            double discount = money * 0.2;
            money -= discount;
        }

        if (money <= budget){
            double diff = Math.abs(budget - money);
            System.out.printf("Safari time! Money left: %.2f lv.",diff);
        }else{
            double diff = Math.abs(budget - money);
            System.out.printf("Not enough money! Money needed: %.2f lv.",diff);
        }
    }
}
