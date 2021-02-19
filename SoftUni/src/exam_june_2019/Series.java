package exam_june_2019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        int serials  = Integer.parseInt(console.nextLine());
        double cost = 0;
        double discount = 0;
        for (int i = 1; i <= serials; i++) {
            String name = console.nextLine();
            double price = Double.parseDouble(console.nextLine());
            switch (name){
                case "Thrones":
                    discount = price * 0.50;
                    price -= discount;
                    break;
                case "Lucifer":
                    discount = price * 0.40;
                    price -= discount;
                    break;
                case "Protector":
                    discount = price * 0.30;
                    price -= discount;
                    break;
                case "TotalDrama":
                    discount = price * 0.20;
                    price -= discount;
                    break;
                case "Area":
                    discount = price * 0.10;
                    price -= discount;
                    break;
                default:
                    break;
            }
            cost += price;
        }

        if (cost <= budget){
            System.out.printf("You bought all the series and left with %.2f lv.",Math.abs(cost-budget));
        }else if (cost > budget){
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(cost-budget));
        }
    }
}
